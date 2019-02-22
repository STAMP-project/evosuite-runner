# R script
# 
# author: Xavier Devroey

library(dplyr)

# ------------------------------
# Constants
# ------------------------------

TOTAL_RUNS_COUNTS = 30

CONFIGURATION_LEVELS = c("no s.", "test s. 0.3", "test s. 0.5", "test s. 0.8", "test s. 1",
                         "model s. 0.3", "model s. 0.5", "model s. 0.8", "model s. 1")

# ------------------------------
# Functions definition
# ------------------------------

removeZeroLineCoverages <- function(df){
  configsCount = nrow(df %>%
                        distinct(configuration))
  to_remove <- df %>%
    filter(LineCoverage_value == 0) %>%
    group_by(class) %>%
    summarise(count = n()) %>%
    filter(count == configsCount * TOTAL_RUNS_COUNTS) %>% # identify the ones that have 0 line coverage valur for all configurations
    distinct(class)
  return(df %>%
           filter(!(class %in% to_remove$class)))
}

# Get results with model seeding
#
getModelSeedingResults <- function(){
  df <- read.csv('../results/model-results.csv') %>%
    mutate(configuration = paste('model s.', clone_seed_p)) %>%
    rbind(read.csv('../results/no-results.csv') %>%
            mutate(configuration = 'no s.'))
  df <- removeZeroLineCoverages(df)
  df$configuration_factor = factor(df$configuration, levels = CONFIGURATION_LEVELS, ordered = TRUE)
  return(df)
}

# Get results with test seeding
#
getTestSeedingResults <- function(){
  df <- read.csv('../results/test-results.csv')  %>%
    mutate(configuration = paste('test s.', clone_seed_p))
  
  df <- read.csv('../results/model-results.csv') %>%
    mutate(configuration = paste('model s.', clone_seed_p)) %>%
    rbind(read.csv('../results/no-results.csv') %>%
            mutate(configuration = 'no s.')) %>%
    filter(class %in% df$class) %>%
    rbind(df)
  df <- removeZeroLineCoverages(df)
  df$configuration_factor = factor(df$configuration, levels = CONFIGURATION_LEVELS, ordered = TRUE)
  return(df)
}

