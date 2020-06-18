
library(dplyr)

TOTAL_RUNS = 10
classes <- c("com.google.gson.stream.JsonReader")
LIMIT = 0

readModelAllMutantsCSV <- function(){
  csvFile='../../../pitest/killed_mutants/allModelMutants.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  df <- df %>%
    filter(class %in% classes)
  
  return(df)
}


readPureAllMutantsCSV <- function(){
  csvFile='../../../pitest/killed_mutants/allPureMutants.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  df <- df %>%
    filter(class %in% classes)
  
  return(df)
}


getModelMutants <- function(){
  df <-readModelAllMutantsCSV()
  df$file <- NULL
  df <- df %>%
    mutate(covered = ifelse(status=="KILLED",1,0),
           exec_killed = ifelse(status=="KILLED",paste(df$execution_id,"->",df$killer,sep = ""),"") ) %>%
    group_by(class,mutant_id,method,line,mutant_operator) %>%
    summarise(kill_count = sum(covered), final_status = paste0(exec_killed, collapse = "|")) %>%
    mutate(status = ifelse(kill_count>LIMIT,"KILLED","NOT_KILLED"))
  
  return(df)
}


getPureMutants <- function(){
  df <-readPureAllMutantsCSV()
  df$file <- NULL
  df <- df %>%
    mutate(covered = ifelse(status=="KILLED",1,0),
           exec_killed = ifelse(status=="KILLED",paste(df$execution_id,"->",df$killer,sep = ""),"") ) %>%
    group_by(class,mutant_id,method,line,mutant_operator) %>%
    summarise(kill_count = sum(covered), final_status = paste0(exec_killed, collapse = "|")) %>%
    mutate(status = ifelse(kill_count>LIMIT,"KILLED","NOT_KILLED"))
  
  return(df)
}


getManualMutants <- function(){
  csvFile='../../../pitest/out/manual/1//mutations.csv'
  df <- read.csv(csvFile, stringsAsFactors = FALSE)
  df$file <- NULL
  df$status <-  ifelse(df$status=="KILLED","KILLED","NOT_KILLED")
  df$mutant_id <- seq.int(nrow(df))-1
  
  return(df)
}
