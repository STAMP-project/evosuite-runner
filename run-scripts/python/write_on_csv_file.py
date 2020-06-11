import sys
import fcntl
import csv
import re
import os
# This python script parses the given EvoSuite's execution log to collect the valuable data and saves them in the csv file.
## input arguments
type=sys.argv[1]
execution_idx=sys.argv[2]
application=sys.argv[3]
class_name=sys.argv[4]
clone_seed_p=""
random_abstract_test_selection=""
if type != "no":
    clone_seed_p=sys.argv[5]
    p_object_pool=sys.argv[6]

dir_path = os.path.dirname(os.path.realpath(__file__))
if type == "model":
    random_abstract_test_selection =sys.argv[7]
    log_dir = os.path.join(dir_path, "..", "..", "logs","model_seeding",application+"-"+class_name+"-"+clone_seed_p+"-"+p_object_pool+"-"+execution_idx+"-"+random_abstract_test_selection+"-out.txt")
elif type =="test":
    log_dir = os.path.join(dir_path, "..", "..", "logs","test_seeding",application+"-"+class_name+"-"+clone_seed_p+"-"+execution_idx+"-out.txt")
else:
    p_object_pool=0
    log_dir = os.path.join(dir_path, "..", "..", "logs","no_seeding",application+"-"+class_name+"-"+execution_idx+"-out.txt")

out_dir = os.path.join(dir_path, "..", "..", "results",type+"-results.csv")
##



### functions
def write_on_csv_file(csv_result,csv_file_dir):
    title_order = [
                   "execution_idx",
                   "application",
                   "class",
                   "clone_seed_p",
                   "p_object_pool",
                   "random_abstract_test_selection",
                   "LineCoverage_value",
                   "LineCoverage_evaluations",
                   "BranchCoverage_value",
                   "BranchCoverage_evaluations",
                   "ExceptionCoverage_value",
                   "ExceptionCoverage_evaluations",
                   "WeakMutation_value",
                   "WeakMutation_evaluations",
                   "OutputCoverage_value",
                   "OutputCoverage_evaluations",
                   "MethodCoverage_value",
                   "MethodCoverage_evaluations",
                   "CBranch_value",
                   "CBranch_evaluations",
                   "current_fitness_evaluations"
                   ]

    fields = []

    for cell in title_order:
        if cell in csv_result.keys():
            fields.append(csv_result[cell])
        else:
            fields.append("")

    with open(csv_file_dir, "a") as  g:
        fcntl.flock(g, fcntl.LOCK_EX)
        writer = csv.writer(g)
        writer.writerow(fields)
        fcntl.flock(g, fcntl.LOCK_UN)
###




csv_result = {"execution_idx": execution_idx,
              "application": application,
              "class": class_name,
              "clone_seed_p": clone_seed_p,
              "p_object_pool": p_object_pool,
              "random_abstract_test_selection": random_abstract_test_selection,
              "LineCoverage_value":"0",
              "LineCoverage_evaluations":"",
              "BranchCoverage_value":"0",
              "BranchCoverage_evaluations":"",
              "ExceptionCoverage_value":"0",
              "ExceptionCoverage_evaluations":"",
              "WeakMutation_value":"0",
              "WeakMutation_evaluations":"",
              "OutputCoverage_value":"0",
              "OutputCoverage_evaluations":"",
              "MethodCoverage_value":"0",
              "MethodCoverage_evaluations":"",
              "CBranch_value":"0",
              "CBranch_evaluations":"",
              "current_fitness_evaluations":""
              }

with open(log_dir, "r") as ins:
    current_fitness_evaluations=0
    for stdout_line in ins:
        if  "Current fitness function value:" in stdout_line:
            splitted_line_1 = stdout_line.split(" ** ")
            splitted_line_1[1]=splitted_line_1[1].replace('\n', ' ').replace('\r', '')
            value = float(splitted_line_1[1])
            if "LineCoverageSuiteFitness" in stdout_line:
                current_fitness_evaluations+=1
                if float(csv_result["LineCoverage_value"]) < value :
                    csv_result["LineCoverage_value"] = splitted_line_1[1]
                    csv_result["LineCoverage_evaluations"]+="["+splitted_line_1[1]+","+str(current_fitness_evaluations)+"]"
            elif "BranchCoverageSuiteFitness" in stdout_line:
                if float(csv_result["BranchCoverage_value"]) < value :
                    csv_result["BranchCoverage_value"] = splitted_line_1[1]
                    csv_result["BranchCoverage_evaluations"]+="["+splitted_line_1[1]+","+str(current_fitness_evaluations)+"]"
            elif "ExceptionCoverageSuiteFitness" in stdout_line:
                if float(csv_result["ExceptionCoverage_value"]) < value :
                    csv_result["ExceptionCoverage_value"] = splitted_line_1[1]
                    csv_result["ExceptionCoverage_evaluations"]+="["+splitted_line_1[1]+","+str(current_fitness_evaluations)+"]"
            elif "WeakMutationSuiteFitness" in stdout_line:
                if float(csv_result["WeakMutation_value"]) < value :
                    csv_result["WeakMutation_value"] = splitted_line_1[1]
                    csv_result["WeakMutation_evaluations"]+="["+splitted_line_1[1]+","+str(current_fitness_evaluations)+"]"
            elif "OutputCoverageSuiteFitness" in stdout_line:
                if float(csv_result["OutputCoverage_value"]) < value :
                    csv_result["OutputCoverage_value"] = splitted_line_1[1]
                    csv_result["OutputCoverage_evaluations"]+="["+splitted_line_1[1]+","+str(current_fitness_evaluations)+"]"
            elif "MethodCoverageSuiteFitness" in stdout_line:
                if float(csv_result["MethodCoverage_value"]) < value :
                    csv_result["MethodCoverage_value"] = splitted_line_1[1]
                    csv_result["MethodCoverage_evaluations"]+="["+splitted_line_1[1]+","+str(current_fitness_evaluations)+"]"
            elif "CBranchSuiteFitness" in stdout_line:
                if float(csv_result["CBranch_value"]) < value :
                    csv_result["CBranch_value"] = splitted_line_1[1]
                    csv_result["CBranch_evaluations"]+="["+splitted_line_1[1]+","+str(current_fitness_evaluations)+"]"

        # elif "Current fitness evaluations:" in stdout_line:
        #     splitted_line_1 = stdout_line.split("evaluations: ")
        #     current_fitness_evaluations = splitted_line_1[1].replace('\n', ' ').replace('\r', '')
        #     csv_result["current_fitness_evaluations"] = current_fitness_evaluations


write_on_csv_file(csv_result,out_dir)
