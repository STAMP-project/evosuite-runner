
library(dplyr)

TOTAL_RUNS = 10
classes <- c("com.google.gson.stream.JsonReader","com.google.gson.internal.bind.TypeAdapters")

getCoveredByModelSeeding <- function(){
  csvFile='../../../pitest/killed_mutants/modelKilled.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  df <- df %>%
    filter(model_random_abstract_test_selection == "TRUE" & target_class %in% classes)
  
  return(df)
}

getModelVSManual <- function(){
  csvFile='../../../pitest/killed_mutants/modelvsManual.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  
  return(df)
}


getModelVSManual_majority <- function(){
  df <- getModelVSManual()
  
  df2 <- df %>%
    group_by(killed_by,execution_id) %>%
    summarise(count=n())
  write.csv(df2,'../results/modelVsManual_killers.csv')
  df$exec_killed <- paste(df$execution_id,"->",df$killed_by,sep = "")
  df <- df %>%
    group_by(mutant_id,mutation_operator,target_class,method,line,total_mutants) %>%
    summarise(count = n(), killing_tests=paste0(exec_killed, collapse = "|"))
}


getManualVSModel <- function(){
  csvFile='../../../pitest/killed_mutants/manualvsModel.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  df$exec_killed <- paste(df$execution_id,"->",df$killed_by,sep = "")
  
  df <- df %>%
    group_by(mutant_id,mutation_operator,target_class,method,line,total_mutants) %>%
    summarise(count = n(), killing_tests=paste0(exec_killed, collapse = "|"))
  
  return(df)
}

getManualVSPure <- function(){
  csvFile='../../../pitest/killed_mutants/manualvsPure.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  df$exec_killed <- paste(df$execution_id,"->",df$killed_by,sep = "")
  
  df <- df %>%
    group_by(mutant_id,mutation_operator,target_class,method,line,total_mutants) %>%
    summarise(count = n(), killing_tests=paste0(exec_killed, collapse = "|"))
  
  return(df)
}
getPureVSManual <- function(){
  csvFile='../../../pitest/killed_mutants/purevsManual.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  
  return(df)
}


getPureVSManual_majority <- function(){
  df <- getPureVSManual()
  
  df2 <- df %>%
    group_by(killed_by,execution_id) %>%
    summarise(count=n())
  df$exec_killed <- paste(df$execution_id,"->",df$killed_by,sep = "")
  df <- df %>%
    group_by(mutant_id,mutation_operator,target_class,method,line,total_mutants) %>%
    summarise(count = n(), killing_tests=paste0(exec_killed, collapse = "|"))
}

getCoveredByModelSeeding_majority <- function(){
  df<-getCoveredByModelSeeding() %>%
    group_by(mutant_id,mutation_operator,target_class,method,line,total_mutants) %>%
    summarise(count = n()) 
  
  return(df)
}


getMutantsKilledByModel_majority <- function(){
  allMutants <- getCoveredByModelSeeding()
  majorityMutants <- getCoveredByModelSeeding_majority()
  
  df <- left_join(majorityMutants,allMutants, by=c("mutant_id","mutation_operator","target_class","method","line","total_mutants"))
  
  return(df)
}


getCoveredByPureEvoSuite <- function(){
  csvFile='../../../pitest/killed_mutants/pureKilled.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  df <- df %>%
    filter(model_random_abstract_test_selection == "TRUE" & target_class %in% classes)
  
  return(df)
}



getCoveredByPureEvoSuite_majority <- function(){
  df<-getCoveredByPureEvoSuite() %>%
    group_by(mutant_id,mutation_operator,target_class,method,line,total_mutants) %>%
    summarise(count = n()) 
  
  return(df)
}


getMutantsKilledByPureEvoSuite_majority <- function(){
  allMutants <- getCoveredByPureEvoSuite()
  majorityMutants <- getCoveredByPureEvoSuite_majority()
  
  df <- left_join(majorityMutants,allMutants, by=c("mutant_id","mutation_operator","target_class","method","line","total_mutants"))
  
  return(df)
}
