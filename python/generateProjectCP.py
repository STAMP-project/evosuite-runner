from os import listdir
from os.path import isfile, join
import sys

mypath=sys.argv[1]
onlyfiles = [f for f in listdir(mypath) if isfile(join(mypath, f))]
result=""
for file in onlyfiles:
    result=result+mypath+"/"+file+":"


print result[:-1]
