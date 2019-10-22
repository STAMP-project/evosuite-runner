cat modelInput.csv | while  read ligne ; do

IFS=',' read -r -a array <<< "$ligne"

package="${array[0]}"
project="${array[1]}"
echo $ligne
echo $project
echo $package
echo 'momo'
echo 'java -d64 -jar botsing-model-generation-1.0.7.jar -project_cp '"bins/$project"' -project_prefix '"$package"' -out_dir '"analysis-result/$project"''

java -d64 -jar botsing-model-generation-1.0.7.jar -project_cp "bins/$project" -project_prefix "$package" -out_dir "analysis-result/$project"

done

