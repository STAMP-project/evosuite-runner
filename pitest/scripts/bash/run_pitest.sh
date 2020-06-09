
#!/usr/bin/env bash
flagtest=0
flagmodel=0
# Check the input parameter to set the EvoSuite execution mode (no-seeding, test_seeding, or model_seeding)
while [ "$1" != "" ]; do
    case $1 in
        -m | --model )   flagmodel=1
                        shift ;;
        -t | --test )    flagtest=1
                        shift ;;
        * )             break ;;
    esac
done

random_abstract_test_selection="FALSE"
if [[ "$flagmodel" -eq 1 ]]; then
  while [ "$1" != "" ]; do
      case $1 in
        -r | --random )   random_abstract_test_selection="TRUE"
                        shift
                        echo "Random abstract test selection is on!" ;;
        * )             break ;;
    esac
done
fi

# 2nd parameter: number of execution repeats
rounds=$1
# 3rd parameter: number of execution repeats
parallelExecutions=$2
# 4th parameter: List of target classes
classes=$3
# 4th parameter: Number of parallel PIT processes
RunLimit=$4
# 5th parameter: p object pool probability
p_object_pool=$5
# 6th parameter: list of clone probabilities seperated by ,
IFS=',' read -r -a clone_seed <<< "$6"


# Check if an array contains the given element
containsElement () {
  local e match="$1"
  shift
  for e; do [[ "$e" == "$match" ]] && return 1; done
  return 0
}





for ((i=1;i<=$rounds;i++));
do
    echo "Round $i experiment"
    echo $clone_seed
    # for each clone seed probability
    for clone_seed_p in "${clone_seed[@]}"
    do
        IFS=,
        echo "e"
        # for each class which is indicated in the classes.csv file
        while read class project
        do
            project_name="$project"
            target_class="$class"
            execution_id="$i"
            echo "project: "$project_name
            echo "target_class: "$target_class
            echo "clone_seed_p: "$clone_seed_p
            echo "execution_id: "$execution_id
            projectCP=$(ls -d -1 "$PWD/bins/$project_name/"* | tr '\n' ':')
            test_execution_libs=$(ls -p "$PWD/pitest/libs/test_execution/"* | tr '\n' ':')
            if [[ "$flagmodel" -eq 1 ]]; then
                seeding_type="model"
                clone_seed_p="$clone_seed_p"
                p_object_pool="$p_object_pool"
                testDir="$PWD/generated_tests/"$seeding_type"_seeding/$project_name-$target_class-$clone_seed_p-$p_object_pool-$execution_id-$random_abstract_test_selection"
                pitDir="pitest/out/"$seeding_type"_seeding/$project_name-$target_class-$clone_seed_p-$p_object_pool-$execution_id-$random_abstract_test_selection"
            else
                seeding_type="no"
                clone_seed_p=""
                p_object_pool=""
                testDir="$PWD/generated_tests/"$seeding_type"_seeding/$project_name-$target_class-0-$execution_id"
                pitDir="pitest/out/"$seeding_type"_seeding/$project_name-$target_class-0-$execution_id"
            fi
            
            # 1- Compile scaffolding
            find "$testDir" -type f -name "*_scaffolding.java" | while read scaffoldingTest; do
                javac -cp "$projectCP$test_execution_libs" $scaffoldingTest &
            done
            scaffodlingClassPathEntryDir="$testDir"
            # 1.a- check if the PIT report is already generated
            if [ -d $pitDir ]; then
                echo "The PIT report is already available in $pitDir"
                continue
            fi
            find $testDir -type f -name "*_ESTest.java" | while read mainTest; do
                # 1.b- Seperate classloaders
                python run-scripts/python/separate-loader-editor.py $mainTest
                # 2- Compile the main test
                javac -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" $mainTest &
            done

            # 3- Run the main test for 5 times. if it fails even once, we count it as a flaky test and we will ignore it.
            for ((run=1;run<=$RunLimit;run++))
            do
                java -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" org.junit.runner.JUnitCore $target_class"_ESTest" > $scaffodlingClassPathEntryDir/junit_result.txt
                cat $scaffodlingClassPathEntryDir/junit_result.txt
                failingTestsOutput=$(python pitest/scripts/python/parse_failing_tests.py "$scaffodlingClassPathEntryDir/junit_result.txt")
                read -r -a array <<< "$failingTestsOutput"
                for index in "${!array[@]}"
                    do
                        containsElement "${array[index]}" "${flaky_tests[@]}"
                        if [[ "$?" -eq "0" ]]; then
                            flaky_tests+=("${array[index]}")
                        fi
                    done
                printf 'The test is: %s\n' "${flaky_tests[@]}"

                if (( ${#flaky_tests[@]} )); then
                    for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
                        java -jar pitest/libs/flaky_related/IgnoreAdder.jar $mainTest "${flaky_tests[@]}"
                    done
                fi
            done
            # 4- Compile main tests again after potential changes (changes = add @ignore to flaky test cases).
            javac -cp "$projectCP$test_execution_libs$scaffodlingClassPathEntryDir" $mainTest
            pitestLibs=$(ls -d -1 "pitest/libs/pitest/"* | tr '\n' ':')

            # 5- Run pitest
            classPaths="$projectCP$test_execution_libs$scaffodlingClassPathEntryDir:$pitestLibs"
            #ToDo: add source
            sourceDirs="sources/$project_name/src"
            outDir=$pitDir
            mutableCPs=$(python pitest/scripts/python/export_mutable_cps.py $projectCP)
            # Add PIT execution command and parser

        done < "$classes"
    done
done
return


    #     # 5- Run pitest
    #     classPaths="$projectCP$test_execution_libs$scaffodlingClassPathEntryDir:$pitestLibs"
    #     sourceDirs="sources/$project_name/src"
    #     outDir="pitest/out/$seeding_type/$project_name-$target_class-$clone_seed_p-$execution_id"
    #     mutableCPs=$(python pitest/scripts/python/export_mutable_cps.py $projectCP)


    #     java -cp $classPaths org.pitest.mutationtest.commandline.MutationCoverageReport \
    #   --reportDir $outDir \
    #   --targetClasses $target_class \
    #   --targetTests $target_class"_ESTest" \
    #   --mutableCodePaths "$mutableCPs" \
    #   --testPlugin evosuite \
    #   --sourceDirs $sourceDirs \
    #   --mutators ALL \
    #   --timestampedReports=false \
    #   --outputFormats "HTML,XML,CSV" > "pitest/logs/$project_name-$target_class-$clone_seed_p-$execution_id.txt" 2>&1 &

    #   pid=$!

    #   while (( $(pgrep -l java | wc -l) >= $parallelExecutions ))
    # do
    #   sleep 1
    # done
    # done
# done