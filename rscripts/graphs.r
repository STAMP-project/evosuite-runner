# R script
# 
# author: Xavier Devroey

library(dplyr)
library(ggplot2)

source('data.r')

# ------------------------------
# Constants
# ------------------------------

COLOR_PALETTE="Spectral" # Use photocopy friendly colors (http://colorbrewer2.org/)

# ------------------------------
# Functions definition
# ------------------------------

plotLineCoverage <- function(results){
  p <- ggplot(results, aes(x = application, y = LineCoverage_value, fill = configuration_factor)) +
    geom_boxplot() +
    scale_fill_brewer(palette=COLOR_PALETTE) + 
    xlab(NULL) + 
    ylab('line coverage') + 
    scale_y_continuous(labels = scales::percent) +
    guides(fill=guide_legend(title=NULL))
  return(p)
}

plotBranchCoverage <- function(results){
  p <- ggplot(results, aes(x = application, y = BranchCoverage_value, fill = configuration_factor)) +
    geom_boxplot() +
    scale_fill_brewer(palette=COLOR_PALETTE) + 
    xlab(NULL) + 
    ylab('branch coverage') + 
    scale_y_continuous(labels = scales::percent) +
    guides(fill=guide_legend(title=NULL))
  return(p)
}

plotWeakMutationCoverage <- function(results){
  p <- ggplot(results, aes(x = application, y = WeakMutation_value, fill = configuration_factor)) +
    geom_boxplot() +
    scale_fill_brewer(palette=COLOR_PALETTE) + 
    xlab(NULL) + 
    ylab('weak mutation coverage') + 
    scale_y_continuous(labels = scales::percent) +
    guides(fill=guide_legend(title=NULL))
  return(p)
}

plotNumberOfFitnessEvaluations <- function(results){
  p <- ggplot(results, aes(x = application, y = current_fitness_evaluations, fill = configuration_factor)) +
    geom_boxplot() +
    scale_fill_brewer(palette=COLOR_PALETTE) + 
    xlab(NULL) + 
    ylab('number of fitness evaluations') +
    scale_y_log10() +
    guides(fill=guide_legend(title=NULL))
  return(p)
}

# ------------------------------
# Program
# ------------------------------

# Plot results with model seeding

results <- getModelSeedingResults()

p <- plotLineCoverage(results)
ggsave(plot = p, filename = '../graphs/model-seeding-line-coverage.pdf', width=130, height=80, units = "mm" )

p <- plotBranchCoverage(results)
ggsave(plot = p, filename = '../graphs/model-seeding-branch-coverage.pdf', width=130, height=80, units = "mm" )

p <- plotWeakMutationCoverage(results)
ggsave(plot = p, filename = '../graphs/model-seeding-weakmutation-coverage.pdf', width=130, height=80, units = "mm" )

p <- plotNumberOfFitnessEvaluations(results)
ggsave(plot = p, filename = '../graphs/model-seeding-total-fitness-evaluations.pdf', width=130, height=80, units = "mm" )


# Get results with test seeding

results <- getTestSeedingResults()

p <- plotLineCoverage(results)
ggsave(plot = p, filename = '../graphs/test-seeding-line-coverage.pdf', width=130, height=80, units = "mm" )

p <- plotBranchCoverage(results)
ggsave(plot = p, filename = '../graphs/test-seeding-branch-coverage.pdf', width=130, height=80, units = "mm" )

p <- plotWeakMutationCoverage(results)
ggsave(plot = p, filename = '../graphs/test-weakmutation-coverage.pdf', width=130, height=80, units = "mm" )

p <- plotNumberOfFitnessEvaluations(results)
ggsave(plot = p, filename = '../graphs/test-seeding-total-fitness-evaluations.pdf', width=130, height=80, units = "mm" )


