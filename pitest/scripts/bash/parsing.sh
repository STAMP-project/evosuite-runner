## inputs
pid=$1
execution_id=$2
project=$3
classPaths=$4
outDir=$5
target_class=$6
sourceDirs=$7
mutableCPs=$8
logFile="$9"
resultDir="${10}"
outDir="${11}"
##


## wait for the process to finish
while kill -0 "$pid"; do
    sleep 1
done

exists=$(python pitest/scripts/python/exists_in_file.py "$logFile" "did not pass without mutation")


if [[ "$exists" == "TRUE" ]]
then
    echo "A problem in the PIT execution has been found."
    echo "Fixing the problem ..."
    failedClass=$(python pitest/scripts/python/detect_failing_class.py "$logFile" "did not pass without mutation")
    failedTest=$(python pitest/scripts/python/detect_failing_test.py "$logFile" "did not pass without mutation")

    # Add @Ignore to failing tests
    for mainTest in `find $resultDir -name "*_ESTest.java" -type f`; do
          java -jar pitest/libs/flaky_related/IgnoreAdder.jar $mainTest "$failedTest"
          projectCP=$(ls -d -1 "$PWD/bins/$project/"* | tr '\n' ':')
          test_execution_libs=$(ls -p "$PWD/pitest/libs/test_execution/"* | tr '\n' ':')
          preparedCPs="$projectCP:$test_execution_libs"
          javac -cp "$preparedCPs:$resultDir" $mainTest
    done

    echo "Problem has been fixed."
    echo "Rerunning the PIT execution ..."
     . pitest/scripts/bash/execution.sh $execution_id $project $classPaths $outDir $target_class $sourceDirs "$mutableCPs" "$logFile" "$resultDir" "$outDir" &
else
    echo "PIT execution is finished. Execution log: $logFile"
fi