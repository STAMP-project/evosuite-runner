
pitestLibs=$(ls -d -1 "pitest/libs/pitest/"* | tr '\n' ':')
classPaths=$(ls -d -1 "$PWD/bins/gson/"* | tr '\n' ':')
test_execution_libs="/Users/pooria/Documents/repos/evosuite-runner/pitest/libs/test_execution/junit-4.10.jar"
outDir="$PWD/manual-report"
target_class="com.google.gson.stream.JsonReader"
target_test="com.google.gson.stream.JsonReaderTest"
sourceDirs="sources/gson/gson/src"
mutableCPs="/Users/pooria/Documents/repos/evosuite-runner/bins/gson/gson-2.8.7-SNAPSHOT.jar"
# CP=$classPaths$pitestLibs$test_execution_libs
CP="/Users/pooria/Documents/repos/evosuite-runner/bins/gson/gson-2.8.7-SNAPSHOT.jar:/Users/pooria/Documents/repos/evosuite-runner/bins/gson/gson-2.8.7-SNAPSHOT-tests.jar:pitest/libs/pitest/pitest-1.4.3.jar:pitest/libs/pitest/pitest-command-line-1.4.3.jar:pitest/libs/pitest/pitest-entry-1.4.3.jar:/Users/pooria/Documents/repos/evosuite-runner/pitest/libs/test_execution/junit-4.13.jar"
echo "$target_test"
echo "$CP"


java -cp "$CP" org.pitest.mutationtest.commandline.MutationCoverageReport \
            --reportDir $outDir \
            --targetClasses $target_class \
            --targetTests "$target_test" \
            --sourceDirs "$sourceDirs" \
            --mutableCodePaths "$mutableCPs" \
            --mutators ALL \
            --threads 10 \
            --timestampedReports=false \
            --outputFormats "HTML,XML,CSV" 
