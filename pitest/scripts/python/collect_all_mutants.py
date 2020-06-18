import sys,os
import csv

reprotDir=sys.argv[1]
outDir=sys.argv[2]
execution_id=sys.argv[3]

csvFile = open(outDir,"a")
csvWriter = csv.writer(csvFile)



outputCSV=os.path.join(reprotDir,"mutations.csv")

with open(outputCSV) as f:
    reader = csv.reader(f)
    mutation_data = list(reader)


for index in range(0, len(mutation_data)):
    row=mutation_data[index]
    row.append(index)
    row.append(execution_id)

    csvWriter.writerow(row)