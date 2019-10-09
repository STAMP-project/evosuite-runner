#get SF110 benchmark sources
wget http://www.evosuite.org/files/SF110-20130704-src.zip
unzip SF110-20130704-src.zip
rm SF110-20130704-src.zip

find SF110-20130704-src -maxdepth 1 -type d -print0 |

#loop over all benchmark projects
while IFS= read -rd '' dir; 
do 

#build src and test jars
ant jar -f $dir;
ant jar-tests -f $dir;

echo $dir;
folder="$(basename $dir)";
echo $folder

#find generated jars and move them to bins/ folder
find $dir -name '*.jar' -maxdepth 1 -exec sh -c 'mkdir -p bins/'$folder' && cp {} bins/'$folder'' _ {}  \;

done

