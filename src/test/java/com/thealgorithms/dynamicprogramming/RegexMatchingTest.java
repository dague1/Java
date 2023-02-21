package com.thealgorithms.dynamicprogramming;

import com.thealgorithms.CoverageResults;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegexMatchingTest {

    @AfterAll
    static void checkCoverage() {
        CoverageResults.printCoverageResults("regexRecursion(String src, String pat) in dynamicprogramming/RegexMatching.java", RegexMatching.getCoverageDivideFlags2arg());
        CoverageResults.printCoverageResults("regexRecursion(String src, String pat, int svidx, int pvidx) in dynamicprogramming/RegexMatching.java", RegexMatching.getCoverageDivideFlags4arg());
        CoverageResults.printCoverageResults("regexRecursion(String src, String pat, int svidx, int pvidx, int[][] strg) in dynamicprogramming/RegexMatching.java", RegexMatching.getCoverageDivideFlags5arg());
    }

    @Test
    /*
    * Dummy test in order to be able to run coverage tool when no real tests are present
    * */
    void dummyTest() {
        return;
    }
}