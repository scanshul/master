package com.project.aj;

import java.util.*;

public class MarginalTaxRateSystem {
    public static double calculateTax(double[] cutoffs, double[] rates, double income) {
        double tax = 0.0;
        double previousCutoff = 0.0;
        
        // Iterate through the cutoffs and apply rates accordingly
        for (int i = 0; i < cutoffs.length; i++) {
            double cutoff = cutoffs[i];
            double rate = rates[i];
            
            if (income > cutoff) {
                tax += (cutoff - previousCutoff) * rate;
                previousCutoff = cutoff;
            } else {
                tax += (income - previousCutoff) * rate;
                break;
            }
        }
        
        // If the income is higher than the last cutoff, apply the highest rate for the remaining income
        if (income > cutoffs[cutoffs.length - 1]) {
            tax += (income - cutoffs[cutoffs.length - 1]) * rates[rates.length - 1];
        }

        return tax;
    }

    public static void main(String[] args) {
        // Example input: cutoffs and rates
        double[] cutoffs = {0, 1000.0};  // Bracket cutoffs
        double[] rates = {0.1, 0.5};             // Corresponding rates
        
        // Example income
        double income = 2000.0;
        
        // Calculate and display the tax owed
        double taxOwed = calculateTax(cutoffs, rates, income);
        System.out.println("Tax owed: " + taxOwed);
    }
}


