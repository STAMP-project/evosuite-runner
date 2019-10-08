from sys import argv
import os

allCPs=argv[1]
arrCP=allCPs.split(":")

finalResult=""

for cp in arrCP:
    finalResult=finalResult+cp+","


print finalResult[:-1]