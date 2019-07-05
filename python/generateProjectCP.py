from os import listdir
from os.path import isfile, join
import sys
## This python script returns a script which includes the jar files in the binary path (sys.argv[1]). The jar files are seperated by ":".
mypath=sys.argv[1]
onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
result=""
for file in onlyfiles:
    result=result+mypath+"/"+file+":"


print result[:-1]
