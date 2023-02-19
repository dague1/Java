package com.thealgorithms;

public class CoverageResults {

    public static void printCoverageResults(String methodInfo, boolean[] results) {
        System.out.println("=========================================================================");
        System.out.println(methodInfo + ":");
        System.out.printf("%-15s %s\n", "Branch Number", "IsCovered");
        int numberBranchCovered = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i])
                numberBranchCovered++;
            System.out.printf("%-15d %b\n", i, results[i]);
        }
        System.out.println("=========================================================================");
        System.out.printf("Total Coverage: %d%% (%d/%d) \n", (numberBranchCovered* 100) / results.length, numberBranchCovered, results.length);
        System.out.println("=========================================================================");
    }

}
