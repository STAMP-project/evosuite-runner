import sys

fileDir=sys.argv[1]
pattern=sys.argv[2]

if pattern in open(fileDir).read():
    print "TRUE"
else:
    print "FALSE"