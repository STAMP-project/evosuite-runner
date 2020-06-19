import os

counter=0
stateSum=0
transitionSum=0
for root, directories, filenames in os.walk('analysis-result'):
    for filename in filenames:
        if(root.endswith('/models') and filename.endswith('.xml')):
            counter+=1
            fileDir = os.path.join(root,filename)
            print fileDir
            file  = open(fileDir, 'r').read()
            stateCount = file.count('<state id=')
            stateSum+=stateCount
            transitionCount = file.count('<transition target=')
            transitionSum+=transitionCount
            print 'state= '+str(stateCount)+' transitions= '+str(transitionCount)


stateAvg = stateSum/counter
transitionAvg = transitionSum/counter


print 'Final Avg state= '+str(stateAvg)+' transitions= '+str(transitionAvg)