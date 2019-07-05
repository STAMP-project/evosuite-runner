flagtest=0
flagmodel=0


# params="-generateTests -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=180"
# params="-generateTests -Dalgorithm=DynaMOSA"



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

rounds=$1
classes=$2
LIMIT=$3
search_budget=$4
population=$5
IFS=', ' read -r -a clone_seed <<< "$6"

echo "Round = $rounds"
echo "classes file = $classes"
echo "LIMIT = $LIMIT"

for ((i=1;i<=$rounds;i++));
do
 echo "Round $i experiment"
 # for each clone seed probability
 for clone_seed_p in "${clone_seed[@]}"
 do
   IFS=,
   # for each class which is indicated in the classes.csv file
   while read class project
    do
      printf 'Running test generation for %s\n' "$class in $project"
      projectCP=$(python python/generateProjectCP.py "bins/$project")
      if [ "$flagmodel" -eq 1 ]; then
        # model_seeding execution mode
        echo "Model seeding is on - seed_clone=$clone_seed_p"
        model_dir="analysis-result/$project/models"
        java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=215000 -Dstopping_condition=MAXFITNESSEVALUATIONS -Dshow_progress=FALSE -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Donline_model_seeding=TRUE -Dmodel_path="$model_dir" -Dtest_dir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$i" > "logs/model_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/model_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
        pid=$!
        . parsing.sh "model" $pid $i $project $class $clone_seed_p &
        # Parse the execution log and save the useful information in to the model_seeding csv file
      elif [[ "$flagtest" -eq 1  ]]; then
        # test_seeding execution mode
        junits=$(python python/collect-junits.py $project $class)
        # Check if we have relative tests for the target class or not.
        if [[ -z "$junits" ]]; then
          echo "There is no test for class $class. Test seeding is skipped"
          # If we donot have one, we will skip test_seeding because test_seeding without test is equivalent to no_seeding.
       else
         echo "Test seeding is on - seed_clone=$clone_seed_p"
         java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=215000 -Dstopping_condition=MAXFITNESSEVALUATIONS -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Dcarve_object_pool=TRUE -Dselected_junit="$junits" -Dtest_dir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i" > "logs/test_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/test_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
         pid=$!
         . parsing.sh "test" $pid $i $project $class $clone_seed_p &
         # Parse the execution log and save the useful information in to the test_seeding csv file
        fi
      else
        # no_seeding execution mode
        echo "No seeding is on"
        echo "$projectCP"
        java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=215000 -Dstopping_condition=MAXFITNESSEVALUATIONS -projectCP "$projectCP" -class "$class" -Dtest_dir="generated_tests/no_seeding/$project-$class-$clone_seed_p-$i" > "logs/no_seeding/$project-$class-$i-out.txt" 2> "logs/no_seeding/$project-$class-$i-err.txt" &
        pid=$!
        . parsing.sh "no" $pid $i $project $class &
        # Parse the execution log and save the useful information in to the no_seeding csv file
        fi

        # If the number of active processes reaches the limit, we will wait, in the following loop, until the end of one of the EvoSuite executions.
        while (( $(pgrep -l java | wc -l) >= $LIMIT ))
        do
              sleep 1
        done

    done < "$classes"

    # The following condition will be true only in the no_seeding execution mode. In this case, we donot need to repeate the experiments for different seeding probabilities (clone_seed). So, we will exit the loop after the first itteration.
    if [[ "$flagmodel" -eq 0 &&  "$flagtest" -eq 0 ]]; then
      break
    fi
 done
done
