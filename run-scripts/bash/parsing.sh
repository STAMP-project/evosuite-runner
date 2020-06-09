type=$1
population=$2
search_budget=$3
pid=$4
execution_idx=$5
project=$6
class=$7
flagmodel=0
flagtest=0
if [ "$type" != "no" ]; then
  clone_seed_p=$8
  clone_seed_p_in_csv=$8
  p_object_pool=$9
  resultDir=${10}
  if [ "$type" == "model" ]; then
    flagmodel=1
    random_abstract_test_selection=${11}
  else
    flagtest=1
  fi
else
  clone_seed_p=0
  clone_seed_p_in_csv=","
  clone_seed_p_in_csv=","
  resultDir=$8
fi

# Wait until the process with the passed pid ends.
while kill -0 "$pid"; do
            sleep 1
done

if [ -d "$resultDir" ] || [ $(grep -q "$execution_idx,$project,$class,$clone_seed_p_in_csv$p_object_pool$random_abstract_test_selection" "results/$type-results.csv") ]; then
echo "Finished: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
  # Parsing the final results
  if [ "$type" != "no" ]; then
    # Parsing test_seeding & model_seeding executions
    python run-scripts/python/write_on_csv_file.py $type $execution_idx $project $class $clone_seed_p $p_object_pool $random_abstract_test_selection &
  else
    # Parsing no_seeding executions
    python run-scripts/python/write_on_csv_file.py $type $execution_idx $project $class &
  fi
else

  # Check the root of problem
  if [ "$type" == "model" ]; then
    LogDir="logs/"$type"_seeding/$project-$class-$clone_seed_p-$p_object_pool-$execution_idx-$random_abstract_test_selection-out.txt"
    errLogDir="logs/"$type"_seeding/$project-$class-$clone_seed_p-$p_object_pool-$execution_idx-$random_abstract_test_selection-err.txt"
  else
    LogDir="logs/"$type"_seeding/$project-$class-$execution_idx-out.txt"
    errLogDir="logs/"$type"_seeding/$project-$class-$execution_idx-err.txt"
  fi

  if grep -q "Current fitness function value: class org.evosuite.coverage.cbranch.CBranchSuiteFitness" "$LogDir"; then
    echo "Incomplete execution. ReRun: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
     . run-scripts/bash/run_evosuite.sh $project $flagmodel $flagtest $clone_seed_p $p_object_pool $class $i $population $search_budget $random_abstract_test_selection
  fi

  if grep -q "Analyzing classpath:" "$LogDir" 
  then
    if grep -q "Fatal crash on main EvoSuite process." "$errLogDir" 
    then
      echo "Incomplete execution (got stuck in cp analysis). ReRun: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
      . run-scripts/bash/run_evosuite.sh $project $flagmodel $flagtest $clone_seed_p $p_object_pool $class $i $population $search_budget $random_abstract_test_selection
    fi
  fi

  lastLine=$(awk '/./{line=$0} END{print line}' $LogDir)
  if [[ "$lastLine" == *"Connecting to master process on port"* ]]; then
    # Re-run the EvoSuite process
    echo "ReRun: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
    . run-scripts/bash/run_evosuite.sh $project $flagmodel $flagtest $clone_seed_p $p_object_pool $class $i $population $search_budget $random_abstract_test_selection
  else
    echo "Problem: class= $class, project= $project, execution_idx= $execution_idx, modelFlag=$flagmodel, TestFlag=$flagtest"
    echo $LogDir
    cat $LogDir
  fi
fi


