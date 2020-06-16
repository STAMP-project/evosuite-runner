import sys,os
import csv

pitDir=sys.argv[1]
csvDir=sys.argv[2]

execution_id=sys.argv[3]
project_name=sys.argv[4]
target_class=sys.argv[5]
clone_seed=sys.argv[6]
p_object_pool=sys.argv[7]
random_abstract_test_selection=sys.argv[8]

fieldnames = ['execution_idx','application','class','clone_seed_p','p_object_pool','random_abstract_test_selection','killed_mutants','total_mutants','mutation_coverage_score']


csvFile = open(csvDir,"a")
csvWriter = csv.writer(csvFile)

htmlReport=os.path.join(pitDir,"index.html")

finalRow = [execution_id, project_name, target_class, clone_seed, p_object_pool, random_abstract_test_selection]

if os.path.exists(htmlReport):
    counter=0
    for line in open(htmlReport, "r"):
        if '<div class="coverage_bar">' in line:
            if counter == 0:
                counter=1
                continue
            percentage=line.split('<td>')[1].split(" <div")[0][:-1]
            number=line.split('<div class="coverage_legend">')[1].split("</div>")[0]
            covered=number.split("/")[0]
            total=number.split("/")[1]
            finalRow.append(covered)
            finalRow.append(total)
            finalRow.append(percentage)
            csvWriter.writerow(finalRow)

            counter+=1
            if counter >= 2:
                break
else:
    finalRow.append(0)
    finalRow.append(0)
    finalRow.append(0)
    csvWriter.writerow(finalRow)