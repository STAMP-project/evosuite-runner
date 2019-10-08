import sys

junit_log_file=sys.argv[1]
result=""
with open(junit_log_file, "r") as ins:
    for stdout_line in ins:
        if  "OK (" in stdout_line:
            break
        elif (''.join([i for i in stdout_line if not i.isdigit()])).startswith(") test("):
            testName = stdout_line.split(")")[1].split("(")[0].replace(" ", "")
            result+=testName+","


print result[:-1]
