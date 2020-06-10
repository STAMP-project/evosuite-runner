#!/bin/bash

execution_id=$1
project=$2
classPaths=$3
outDir=$4
target_class=$5
sourceDirs=$6
mutableCPs=$7
executionLogDir=$8
resultDir="$9"
outDir="${10}"


java -cp $classPaths org.pitest.mutationtest.commandline.MutationCoverageReport \
            --reportDir $outDir \
            --targetClasses $target_class \
            --targetTests $target_class"_ESTest" \
            --testPlugin evosuite \
            --sourceDirs "$sourceDirs" \
            --mutableCodePaths "$mutableCPs" \
            --mutators ALL \
            --threads 10 \
            --timestampedReports=false \
            --outputFormats "HTML,XML,CSV" > "$executionLogDir" 2>&1 & 

            
pid=$!

. pitest/scripts/bash/parsing.sh $pid $execution_id $project $classPaths $outDir $target_class $sourceDirs "$mutableCPs" "$executionLogDir" "$resultDir" "$outDir" &