#!/bin/bash
project=$1
flagmodel=$2
flagtest=$3
clone_seed_p=$4
p_object_pool=$5
class=$6
i=$7

population=$8
search_budget=$9
random_abstract_test_selection=${10}

projectCP=$(python run-scripts/python/generateProjectCP.py "bins/$project")
      if [ "$flagmodel" -eq 1 ]; then
        # model_seeding execution mode
        echo "Model seeding is on - seed_clone=$clone_seed_p, p_object_pool=$p_object_pool"
        model_dir="analysis-result/$project/models"
        generatedTestDir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$p_object_pool-$i-$random_abstract_test_selection"
        java -d64 -Xmx4000m -jar libs/evosuite-master-1.1.0-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dseed_model=TRUE -Dtimeline_interval=10000 -Dsearch_budget=$search_budget  -Dshow_progress=FALSE -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Dp_object_pool="$p_object_pool" -Donline_model_seeding=TRUE -Drandom_abstract_test_selection="$random_abstract_test_selection" -Dmodel_path="$model_dir" -Dtest_dir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$p_object_pool-$i-$random_abstract_test_selection" > "logs/model_seeding/$project-$class-$clone_seed_p-$p_object_pool-$i-$random_abstract_test_selection-out.txt" 2> "logs/model_seeding/$project-$class-$clone_seed_p-$p_object_pool-$i-$random_abstract_test_selection-err.txt" &
        pid=$!
        . run-scripts/bash/parsing.sh "model" $population $search_budget $pid $i $project $class $clone_seed_p $p_object_pool $generatedTestDir $random_abstract_test_selection &
        # Parse the execution log and save the useful information in to the model_seeding csv file
      elif [[ "$flagtest" -eq 1  ]]; then
        # test_seeding execution mode
        junits=$(python run-scripts/python/collect-junits.py $project $class)
        # Check if we have relative tests for the target class or not.
        if [[ -z "$junits" ]]; then
          echo "There is no test for class $class. Test seeding is skipped"
          # If we donot have one, we will skip test_seeding because test_seeding without test is equivalent to no_seeding.
       else
         echo "Test seeding is on - seed_clone=$clone_seed_p"
         generatedTestDir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i"

         java -d64 -Xmx4000m -jar libs/evosuite-master-1.1.0-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dtimeline_interval=10000 -Dsearch_budget=$search_budget -Dshow_progress=FALSE  -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Dcarve_object_pool=TRUE -Dselected_junit="$junits" -Dtest_dir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i" > "logs/test_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/test_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
         pid=$!
         . run-scripts/bash/parsing.sh "test" $population $search_budget $pid $i $project $class $clone_seed_p $generatedTestDir &
         # Parse the execution log and save the useful information in to the test_seeding csv file
        fi
      else
        # no_seeding execution mode
        echo "No seeding is on"
        generatedTestDir="generated_tests/no_seeding/$project-$class-$clone_seed_p-$i"

        java -d64 -Xmx4000m -jar libs/evosuite-master-1.1.0-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=$population -Dtimeline_interval=10000 -Dsearch_budget=$search_budget -Dshow_progress=FALSE  -projectCP "$projectCP" -class "$class" -Dtest_dir="generated_tests/no_seeding/$project-$class-$clone_seed_p-$i" > "logs/no_seeding/$project-$class-$i-out.txt" 2> "logs/no_seeding/$project-$class-$i-err.txt" &
        pid=$!
        . run-scripts/bash/parsing.sh "no" $population $search_budget $pid $i $project $class $generatedTestDir &
        # Parse the execution log and save the useful information in to the no_seeding csv file
      fi