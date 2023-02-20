package com.thealgorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegexMatchingTest {


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

    @Test
    void methodTwoShouldReturnTrueWhenRegexPatternMatchesSource() {
        String input1 = "string";
        String input2 = "s*i?g";
        int svidx = 0;
        int pvidx = 0;
        assertTrue(RegexMatching.regexRecursion(input1, input2, svidx, pvidx));
    }

    @Test
    void methodTwoShouldReturnFalseWhenRegexPatternDoesNotMatchSource() {
        String input1 = "string";
        String input2 = "s*ng?";
        int svidx = 0;
        int pvidx = 0;
        assertFalse(RegexMatching.regexRecursion(input1, input2, svidx, pvidx));
    }

    @Test
    void methodThreeShouldReturnFalseWhenCurrentStrgIndexEqualsOne() {
        String input1 = "source";
        String input2 = "pattern";
        int svidx = 1;
        int pvidx = 1;
        int[][] strg = new int[svidx+1][pvidx+1];
        strg[svidx][pvidx] = 1;
        assertFalse(RegexMatching.regexRecursion(input1, input2, svidx, pvidx, strg));
    }

    @Test
    void methodThreeShouldReturnTrueWhenSrcAndPatLengthEqualsToSvidxAndPvidx() {
        String input1 = "src";
        String input2 = "pat";
        int svidx = 3;
        int pvidx = 3;
        int[][] strg = new int[input1.length()][input2.length()];
        assertTrue(RegexMatching.regexRecursion(input1, input2, svidx, pvidx, strg));
    }

    @Test
    void methodThreeShouldReturnFalseWhenSrcLengthNotEqualSvidx() {
        String input1 = "src";
        String input2 = "pa*";
        int svidx = 2;
        int pvidx = 3;
        int[][] strg = new int[input1.length()][input2.length()];
        assertFalse(RegexMatching.regexRecursion(input1, input2, svidx, pvidx, strg));
    }

    @Test
    void methodThreeShouldReturnTrueWhenCurrentStrgIndexEqualsTwo() {
        String input1 = "source";
        String input2 = "pattern";
        int svidx = 1;
        int pvidx = 1;
        int[][] strg = new int[svidx+1][pvidx+1];
        strg[svidx][pvidx] = 2;
        assertTrue(RegexMatching.regexRecursion(input1, input2, svidx, pvidx, strg));
    }
    
    @Test
    void methodThreeShouldReturnFalseWhenPatLengthNotEqualPvidxAndNoCharIsStar() {
        String input1 = "src";
        String input2 = "pa";
        int svidx = 3;
        int pvidx = 1;
        int[][] strg = new int[input1.length()][input2.length()];
        assertFalse(RegexMatching.regexRecursion(input1, input2, svidx, pvidx, strg));
    }

    @Test
    void methodThreeShouldReturnTrueWhenPatLengthNotEqualPvidxButCharIsStar() {
        String input1 = "src";
        String input2 = "p*";
        int svidx = 3;
        int pvidx = 1;
        int[][] strg = new int[input1.length()][input2.length()];
        assertTrue(RegexMatching.regexRecursion(input1, input2, svidx, pvidx, strg));
    }


}