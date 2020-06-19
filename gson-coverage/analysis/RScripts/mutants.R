source('clean-data-all.r')


manualMutants <- getManualMutants()%>%
  select(class,mutant_id,method,line,mutant_operator,status)
pureMutants <- getPureMutants() %>%
  select(class,mutant_id,method,line,mutant_operator,status)
modelMutants <- getModelMutants() %>%
  select(class,mutant_id,method,line,mutant_operator,status)

mutantTable <- left_join(modelMutants,pureMutants,by=c("class","mutant_id","method","line","mutant_operator"), suffix=c(".model",".pure"))
mutantTable <- left_join(mutantTable,manualMutants,by=c("class","mutant_id","method","line","mutant_operator"))
colnames(mutantTable)[8] <- "status.manual"


model_manual_pure <- mutantTable %>%
  filter(status.model=="KILLED" & status.manual=="NOT_KILLED" & status.pure=="NOT_KILLED")
cat("Model - Manual - Pure:",nrow(model_manual_pure),"\n")

manual_model_pure <- mutantTable %>%
  filter(status.model=="NOT_KILLED" & status.manual=="KILLED" & status.pure=="NOT_KILLED")
cat("Manual - Model - Pure:",nrow(manual_model_pure),"\n")

pure_manual_model <- mutantTable %>%
  filter(status.model=="NOT_KILLED" & status.manual=="NOT_KILLED" & status.pure=="KILLED")
cat("Pure - Model - Manual:",nrow(pure_manual_model),"\n")

pureImodel_manual <- mutantTable %>%
  filter(status.model=="KILLED" & status.manual=="NOT_KILLED" & status.pure=="KILLED")
cat("(Pure ∩ Model) - Manual:",nrow(pureImodel_manual),"\n")

manualImodel_pure <- mutantTable %>%
  filter(status.model=="KILLED" & status.manual=="KILLED" & status.pure=="NOT_KILLED")
cat("(Manual ∩ Model) - Pure:",nrow(manualImodel_pure),"\n")

pureImanual_model <- mutantTable %>%
  filter(status.model=="NOT_KILLED" & status.manual=="KILLED" & status.pure=="KILLED")
cat("(Pure ∩ Manual) - Model:",nrow(pureImanual_model),"\n")

pureImanualImodel <- mutantTable %>%
  filter(status.model=="KILLED" & status.manual=="KILLED" & status.pure=="KILLED")
cat("(Pure ∩ Model) ∩ Manual:",nrow(pureImanualImodel),"\n")

other <- mutantTable %>%
  filter(status.model=="NOT_KILLED" & status.manual=="NOT_KILLED" & status.pure=="NOT_KILLED")
cat("Not Killed:",nrow(other),"\n")

