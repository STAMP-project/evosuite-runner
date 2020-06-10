import sys

fileDir=sys.argv[1]
pattern=sys.argv[2]


for line in open(fileDir, "r"):
    if "did not pass without mutation" in line:
        testName=line.split(", name=")[1].split("]")[0]
        print testName
        break