import sys

fileDir=sys.argv[1]
pattern=sys.argv[2]


for line in open(fileDir, "r"):
    if "did not pass without mutation" in line:
        testName=line.split("[testClass=")[1].split("_ESTest,")[0]
        print testName
        break