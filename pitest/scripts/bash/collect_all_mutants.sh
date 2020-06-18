
#!/usr/bin/env bash
flagmodel=0
# Check the input parameter to set the EvoSuite execution mode (no-seeding, test_seeding, or model_seeding)
while [ "$1" != "" ]; do
    case $1 in
        -m | --model )   flagmodel=1
                        shift ;;
        * )             break ;;
    esac
done

# 2nd parameter: number of execution repeats
rounds=$1
# 3rd parameter: List of target classes
classes=$2
# 4th parameter: p object pool probability
p_object_pool=$3
# 5th parameter: clone probabilities
clone_seed=$4
# 6th parameter: random abstract test selection (TRUE | FALSE)
random_abstract_test_selection=$5

resultDir="pitest/killed_mutants"


for ((i=1;i<=$rounds;i++));
do
    echo "Round $i experiment"
    IFS=,
    # for each class which is indicated in the classes.csv file
    while read class project
    do
    project_name="$project"
    target_class="$class"
    execution_id="$i"
    if [[ "$flagmodel" -eq 1 ]]; then
        reprotDir="pitest/out/model_seeding/$project-$target_class-$clone_seed-$p_object_pool-$i-$random_abstract_test_selection"
        outDir="$resultDir/allModelMutants.csv"
    else
        reprotDir="pitest/out/no_seeding/$project-$target_class-0-$i"
        outDir="$resultDir/allPureMutants.csv"
    fi

    python pitest/scripts/python/collect_all_mutants.py $reprotDir $outDir $execution_id

    done < "$classes"

done