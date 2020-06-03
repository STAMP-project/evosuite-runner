import sys
import json
import os
## This python script read the relevant tests for test_seeding and returns them as a single string. In this string, test suites are seperated by ":"
## input arguments
project=sys.argv[1]
target_class=sys.argv[2]
dir_path = os.path.dirname(os.path.realpath(__file__))
xml_path= os.path.join(dir_path, "..",  "analysis-result",project,"carvedTests","tests.xml")
##

result=""

with open(xml_path) as f:
    data = json.load(f)

if data.has_key(target_class):
    list=data[target_class]
    if len(list) > 0:
        for test in list:
            result+=(test+":")
        result = result[:-1]
print result
