
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
# 3rd parameter: List of target classes
classes=$2
# 4th parameter: p object pool probability
p_object_pool=$3
# 6th parameter: list of clone probabilities seperated by ,
IFS=',' read -r -a clone_seed <<< "$4"

csvDir="pitest/csv/mutation_score.csv"

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
            project_name="$project"
            target_class="$class"
            execution_id="$i"
            echo "project: "$project_name
            echo "target_class: "$target_class
            echo "clone_seed_p: "$clone_seed_p
            echo "execution_id: "$execution_id


            if [[ "$flagmodel" -eq 1 ]]; then
                seeding_type="model"
                pitDir="pitest/out/"$seeding_type"_seeding/$project_name-$target_class-$clone_seed_p-$p_object_pool-$execution_id-$random_abstract_test_selection"
                python pitest/scripts/python/write_mutation_score_csv.py $pitDir $csvDir $execution_id $project_name $target_class $clone_seed $p_object_pool $random_abstract_test_selection
                
            else
                seeding_type="no"
                pitDir="pitest/out/"$seeding_type"_seeding/$project_name-$target_class-0-$execution_id"
                python pitest/scripts/python/write_mutation_score_csv.py $pitDir $csvDir $execution_id $project_name $target_class "0" "0" "-"
            fi
            echo "________"
        done < "$classes"
    done

done