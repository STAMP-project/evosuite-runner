# R script
# 
# author: Xavier Devroey

library(dplyr)
library(ggplot2)

# ------------------------------
# Constants
# ------------------------------



# ------------------------------
# Functions definition
# ------------------------------


results <- read.csv('../results/model-results.csv') %>%
  mutate(configuration = 'model s.') %>%
  rbind(read.csv('../results/no-results.csv') %>%
          mutate(configuration = 'no s.'))

ggplot(results, aes(x = application, y = LineCoverage_value, fill = configuration)) +
  geom_boxplot()

ggplot(results, aes(x = application, y = BranchCoverage_value, fill = configuration)) +
  geom_boxplot()

ggplot(results, aes(x = application, y = WeakMutation_value, fill = configuration)) +
  geom_boxplot()

ggplot(results, aes(x = application, y = current_fitness_evaluations, fill = configuration)) +
  geom_boxplot()

# Get results with test seeding

df <- read.csv('../results/test-results.csv')  %>%
  mutate(configuration = 'test s.')

results_test_s <- df %>%
  rbind(results %>%
          filter(class %in% df$class))

ggplot(results_test_s, aes(x = application, y = LineCoverage_value, fill = configuration)) +
  geom_boxplot()

ggplot(results_test_s, aes(x = application, y = BranchCoverage_value, fill = configuration)) +
  geom_boxplot()

ggplot(results_test_s, aes(x = application, y = WeakMutation_value, fill = configuration)) +
  geom_boxplot()

ggplot(results_test_s, aes(x = application, y = current_fitness_evaluations, fill = configuration)) +
  geom_boxplot()
