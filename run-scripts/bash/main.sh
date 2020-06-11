#!/usr/bin/env bash
flagtest=0
flagmodel=0
# Check the input parameter to set the EvoSuite execution mode (no-seeding, test_seeding, or model_seeding)
while [ "$1" != "" ]; do
    case $1 in
        -m | --model )   flagmodel=1
                        shift
                        echo "Model Seeding mode!"  ;;
        -t | --test )    flagtest=1
                        shift 
                        echo "Test Seeding mode!";;
        * )              break ;;
    esac
done

# if we are in the model seeding mode, we need to check the abstract test case selection
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
# 4th parameter: Maximum number of parallel evosuite instances
LIMIT=$3
# 5th parameter: Search budget in seconds
search_budget=$4
# 6th parameter: Population size
population=$5
# 7th parameter: p object pool probability
p_object_pool=$6
# 8th parameter: list of clone probabilities seperated by ,
IFS=',' read -r -a clone_seed <<< "$7"


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

     if [[ "$flagmodel" -eq 1 ]]; then
      resultFile="results/model-results.csv"
      clone_seed_p_in_csv=$clone_seed_p
     else
      resultFile="results/no-results.csv"
      clone_seed_p_in_csv=","
     fi

    #If we have the final results, skip the rerun
    if grep -q "$i,$project,$class,$clone_seed_p_in_csv,$p_object_pool,$random_abstract_test_selection" $resultFile
    then
      echo "$i,$project,$class,$clone_seed_p_in_csv,$p_object_pool,$random_abstract_test_selection Found"
      continue
    else
      echo "$i,$project,$class,$clone_seed_p_in_csv,$p_object_pool,$random_abstract_test_selection Not Found. Running ..."
    fi

    printf 'Running test generation for %s\n' "$class in $project"
    . run-scripts/bash/run_evosuite.sh $project $flagmodel $flagtest $clone_seed_p $p_object_pool $class $i $population $search_budget $random_abstract_test_selection

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


while (( $(pgrep -l java | wc -l) > 0 ))
    do
                sleep 30
    done
# Sleep for 60 seconds to make sure that all of the reports will be saved
sleep 60
