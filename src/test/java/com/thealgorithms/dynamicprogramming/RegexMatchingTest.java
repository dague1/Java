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
}