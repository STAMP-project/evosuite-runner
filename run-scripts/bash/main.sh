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

# params="-generateTests -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=180"
# params="-generateTests -Dalgorithm=DynaMOSA"

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
# 7th parameter: list of probabilities seperated by ,
IFS=', ' read -r -a clone_seed <<< "$6"

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
    if grep -q "$i,$project,$class,$clone_seed_p_in_csv" $resultFile
    then
      echo "$i,$project,$class,$clone_seed_p_in_csv Found"
      continue
    else
      echo "$i,$project,$class,$clone_seed_p_in_csv Not Found. Rerunning ..."
    fi

    printf 'Running test generation for %s\n' "$class in $project"
    . run_evosuite.sh $project $flagmodel $flagtest $clone_seed_p $class $i $population $search_budget

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
