#!/usr/bin/env bash
modelVSPure=1
manualVSPure=0
pureVSmanual=0
modelVSmanual=0
manualVSmodel=0
# Check the input parameter to set the PIT comparison
while [ "$1" != "" ]; do
    case $1 in
        -p | --pure )   modelVSPure=0
                        shift ;;
        -mp | --manualpure )   manualVSPure=1
                        shift ;;
        -pm | --puremanual )   pureVSmanual=1
                        shift ;;
        -mom | --modelmanual )   modelVSmanual=1
                        shift ;;
        -mmo | --manualmodel )   manualVSmodel=1
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

modelPITOut="pitest/out/model_seeding"
purePITOut="pitest/out/no_seeding"

manualReport="pitest/out/manual/1"

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
        modelReport="$modelPITOut/$project-$target_class-$clone_seed-$p_object_pool-$i-$random_abstract_test_selection"
        pureReport="$purePITOut/$project-$target_class-0-$i"

        if [[ "$manualVSPure" -eq 1 ]]; then
            firstConfReport="$manualReport"
            secondConfReport="$pureReport"
             csvDir="$resultDir/manualvsPure.csv"
        elif [[ "$pureVSmanual" -eq 1 ]]; then
            firstConfReport="$pureReport"
            secondConfReport="$manualReport"
            csvDir="$resultDir/purevsManual.csv"
        elif [[ "$modelVSmanual" -eq 1 ]]; then
            firstConfReport="$modelReport"
            secondConfReport="$manualReport"
            csvDir="$resultDir/modelvsManual.csv"
        elif [[ "$manualVSmodel" -eq 1 ]]; then
            firstConfReport="$manualReport"
            secondConfReport="$modelReport"
            csvDir="$resultDir/manualvsmodel.csv"
        elif [[ "$modelVSPure" -eq 1 ]]; then
            firstConfReport="$modelReport"
            secondConfReport="$pureReport"
            csvDir="$resultDir/modelKilled.csv"
        else
            firstConfReport="$pureReport"
            secondConfReport="$modelReport"
            csvDir="$resultDir/pureKilled.csv"
        fi

        python pitest/scripts/python/collect_killed_mutants.py $firstConfReport $secondConfReport $csvDir $execution_id $project_name $target_class $clone_seed $p_object_pool $random_abstract_test_selection
        
    done < "$classes"
done