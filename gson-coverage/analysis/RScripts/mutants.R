source('data-clean.r')


modelvsmanual <- getModelVSManual_majority()
write.csv(modelvsmanual,'../results/modelvsmanual.csv')

purevsmanual <- getPureVSManual_majority()
write.csv(modelvsmanual,'../results/purevsmanual.csv')