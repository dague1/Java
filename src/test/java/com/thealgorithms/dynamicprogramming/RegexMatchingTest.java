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
    void methodOneShouldReturnFalseWhenPatLengthNotZeroOrChar() {
        String input1 = "";
        String input2 = "!";
        assertFalse(RegexMatching.regexRecursion(input1, input2));
    }

    @Test
    void methodOneShouldReturnFalseWhenPatLengthIsZeroAndSrcLengthIsNotZero() {
        String input1 = "src";
        String input2 = "";
        assertFalse(RegexMatching.regexRecursion(input1, input2));
    }

    @Test
    void methodOneShouldReturnTrueWhenSrcLengthAndPatLengthEqualsZero() {
        String input1 = "";
        String input2 = "";
        assertTrue(RegexMatching.regexRecursion(input1, input2));
    }

    @Test
    void methodOneShouldReturnTrueWhenSrcLengthIsZeroAndPatCharContainsStar() {
        String input1 = "";
        String input2 = "*";
        assertTrue(RegexMatching.regexRecursion(input1, input2));
    }
    
    @Test
    void methodTwoShouldReturnTrueWhenSrcAndPatLengthEqualsSvidxAndPvidx() {
        String input1 = "src";
        String input2 = "pat";
        int svidx = 3;
        int pvidx = 3;
        assertTrue(RegexMatching.regexRecursion(input1, input2, svidx, pvidx));
    }

    @Test
    void methodTwoShouldReturnFalseWhenSrcAndPatLengthNotEqualToSvidxAndPvidx() {
        String input1 = "sr";
        String input2 = "*";
        int svidx = 1;
        int pvidx = 1;
        assertFalse(RegexMatching.regexRecursion(input1, input2, svidx, pvidx));
    }
}