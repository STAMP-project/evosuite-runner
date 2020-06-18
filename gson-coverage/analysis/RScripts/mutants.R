source('data-clean.r')


modelvsmanual <- getModelVSManual_majority()
write.csv(modelvsmanual,'../results/modelvsmanual.csv') 

purevsmanual <- getPureVSManual_majority() 
write.csv(purevsmanual,'../results/purevsmanual.csv')



temp1 <- modelvsmanual %>%
  select(mutant_id,mutation_operator)

temp2 <- purevsmanual %>%
  select(mutant_id,mutation_operator)


result <- setdiff(temp1,temp2)


result2 <- left_join(result,modelvsmanual, by=c("mutant_id","mutation_operator","target_class","method","line"))



write.csv(result2,'../results/onlymodelkilled.csv')




resultP<- intersect(temp2,temp1)