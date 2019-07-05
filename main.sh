flagtest=0
flagmodel=0


# params="-generateTests -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=180"
# params="-generateTests -Dalgorithm=DynaMOSA"

# ToDo: set the value of clone_seed,
clone_seed=(0.3 0.5 0.8 1.0)
search_budget=180
population=100
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
echo "Round = $rounds"
echo "classes file = $classes"
echo "LIMIT = $LIMIT"
for ((i=11;i<=$rounds;i++));
do
 echo "Round $i experiment"
 for clone_seed_p in "${clone_seed[@]}"
 do
   IFS=,
   while read class project
    do
      printf 'Running test generation for %s\n' "$class in $project"
      projectCP=$(python python/generateProjectCP.py "bins/$project")
      if [ "$flagmodel" -eq 1 ]; then
        echo "Model seeding is on - seed_clone=$clone_seed_p"
        model_dir="analysis-result/$project/models"
        java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=215000 -Dstopping_condition=MAXFITNESSEVALUATIONS -Dshow_progress=FALSE -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Donline_model_seeding=TRUE -Dmodel_path="$model_dir" -Dtest_dir="generated_tests/model_seeding/$project-$class-$clone_seed_p-$i" > "logs/model_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/model_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
        pid=$!
        . parsing.sh "model" $pid $i $project $class $clone_seed_p &
      elif [[ "$flagtest" -eq 1  ]]; then
        junits=$(python python/collect-junits.py $project $class)
        if [[ -z "$junits" ]]; then
          echo "There is no test for class $class. Test seeding is skipped"
       else
         echo "Test seeding is on - seed_clone=$clone_seed_p"
         java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=215000 -Dstopping_condition=MAXFITNESSEVALUATIONS -projectCP "$projectCP" -class "$class" -Dseed_clone="$clone_seed_p" -Dcarve_object_pool=TRUE -Dselected_junit="$junits" -Dtest_dir="generated_tests/test_seeding/$project-$class-$clone_seed_p-$i" > "logs/test_seeding/$project-$class-$clone_seed_p-$i-out.txt" 2> "logs/test_seeding/$project-$class-$clone_seed_p-$i-err.txt" &
         pid=$!
         . parsing.sh "test" $pid $i $project $class $clone_seed_p &
        fi
      else
        echo "No seeding is on"
        echo "$projectCP"
        java -d64 -Xmx4000m -jar evosuite-master-1.0.7-SNAPSHOT.jar -generateMOSuite -Dalgorithm=DynaMOSA -Dpopulation=100 -Dsearch_budget=215000 -Dstopping_condition=MAXFITNESSEVALUATIONS -projectCP "$projectCP" -class "$class" -Dtest_dir="generated_tests/no_seeding/$project-$class-$clone_seed_p-$i" > "logs/no_seeding/$project-$class-$i-out.txt" 2> "logs/no_seeding/$project-$class-$i-err.txt" &
        pid=$!
        . parsing.sh "no" $pid $i $project $class &
        fi
        while (( $(pgrep -l java | wc -l) >= $LIMIT ))
        do
              sleep 1
        done
    done < "$classes"
    if [[ "$flagmodel" -eq 0 &&  "$flagtest" -eq 0 ]]; then
      break
    fi
 done
done
