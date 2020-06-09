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

random_abstract_test_selection=""
while [ "$1" != "" ]; do
    case $1 in
        -r | --random )   random_abstract_test_selection="-r"
                        shift ;;
        * )             break ;;
    esac
done

# 2nd parameter: number of execution repeats
rounds=$1
# 3rd parameter: Maximum number of parallel evosuite instances
LIMIT=$2
# 4th parameter: Probability of seed clone
p_object_pool=$3
# 5th parameter: Probability of object pool
seed_clone="$4"

# echo $flagmodel
# echo $random_abstract_test_selection
# echo $rounds
# echo $LIMIT
# echo $seed_clone
# echo "$p_object_pool"
# echo "run-scripts/bash/main.sh -m $random_abstract_test_selection $rounds classes.csv $LIMIT 180 50 $p_object_pool $seed_clone > consoleLog/consoleOutModel.txt 2> consoleLog/consoleErrModel.txt"
# return
# Stop the container from previous experiments
docker stop evosuite-runner-container
# Remove old containers
docker rm evosuite-runner-container
# Remove previous docker image
docker rmi tudelft/evosuite-runner
# Build a new docker image
docker image build -t tudelft/evosuite-runner $(pwd)
# Execution
# After building the the image, we run the container
docker run -dit --name evosuite-runner-container  \
--mount type=bind,source="$(pwd)/consoleLog",target=/evosuite/consoleLog \
--mount type=bind,source="$(pwd)/logs",target=/evosuite/logs \
--mount type=bind,source="$(pwd)/results",target=/evosuite/results \
--mount type=bind,source="$(pwd)/generated_tests",target=/evosuite/generated_tests \
tudelft/evosuite-runner
# Execute main.sh in the running container according to flags


if [ "$flagmodel" -eq 1 ]; then
    #Model seeding
     docker exec -it evosuite-runner-container bash -c "run-scripts/bash/main.sh -m $random_abstract_test_selection $rounds classes.csv $LIMIT 180 50 $p_object_pool $seed_clone > consoleLog/consoleOutModel.txt 2> consoleLog/consoleErrModel.txt"
elif [[ "$flagtest" -eq 1  ]]; then
    #Test seeding
    docker exec -it evosuite-runner-container bash -c "run-scripts/bash/main.sh -t $rounds classes.csv $LIMIT 180 50 0.5 > consoleLog/consoleOutTest.txt 2> consoleLog/consoleErrTest.txt"
else
    # Pure EvoSuite
    docker exec -it evosuite-runner-container bash -c "run-scripts/bash/main.sh $rounds classes.csv $LIMIT 180 50 0 > consoleLog/consoleOutPure.txt 2> consoleLog/consoleErrPure.txt"
fi

echo "Done!"