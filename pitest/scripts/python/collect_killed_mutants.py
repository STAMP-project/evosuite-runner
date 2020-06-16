import sys,os
import csv

firstConfReport=sys.argv[1]
secondConfReport=sys.argv[2]
csvDir=sys.argv[3]

execution_id=sys.argv[4]
project_name=sys.argv[5]
target_class=sys.argv[6]
clone_seed=sys.argv[7]
p_object_pool=sys.argv[8]
random_abstract_test_selection=sys.argv[9]


firstInputCSV=os.path.join(firstConfReport,"mutations.csv")
secondInputCSV=os.path.join(secondConfReport,"mutations.csv")

fieldnames = ['project','target_class','execution_id','model_clone_seed','model_p_object_pool','model_random_abstract_test_selection','total_mutants','mutation_operator','method','line','killed_by','loser_status','mutant_id']

csvFile = open(csvDir,"a")
csvWriter = csv.writer(csvFile)





with open(firstInputCSV) as f:
    reader = csv.reader(f)
    first_mutation_data = list(reader)



with open(secondInputCSV) as f:
    reader = csv.reader(f)
    second_mutation_data = list(reader)


finalRow = [project_name,target_class,execution_id,clone_seed,p_object_pool,random_abstract_test_selection, len(first_mutation_data)]

# loop on mutants
for index in range(0, len(first_mutation_data)):
    finalRow = [project_name,target_class,execution_id,clone_seed,p_object_pool,random_abstract_test_selection, len(first_mutation_data)]
    firstConfRow=first_mutation_data[index]
    secondConfRow=second_mutation_data[index]

    status1=firstConfRow[5]
    status2=secondConfRow[5]

    if status1=="KILLED" and status2!="KILLED":
        mutation_operator=firstConfRow[2]
        method=firstConfRow[3]
        line=firstConfRow[4]
        killed_by=firstConfRow[6]
        loser_status=status2

        print(status1+" vs. "+loser_status+ "--> "+"operator: "+mutation_operator+" method: "+method+ " line: "+line+ " killed_by: "+killed_by)
        finalRow.append(mutation_operator)
        finalRow.append(method)
        finalRow.append(line)
        finalRow.append(killed_by)
        finalRow.append(loser_status)
        finalRow.append(index)
        

        csvWriter.writerow(finalRow)