package com.thealgorithms.maths;

import com.thealgorithms.CoverageResults;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongDivisionTest {

    @AfterAll
    static void checkCoverage() {
        CoverageResults.printCoverageResults("divide(int dividend, int divisor) in maths/LongDivision.java", LongDivision.getCoverageDivideFlags());
    }
	
    @Test
    void testDivideDividendGreaterThanDivisor() {
        assertEquals(3, LongDivision.divide(10,3));
    }
  
      @Test
    void testDivideNegativeDivisor() {
        assertEquals(-2, LongDivision.divide(7,-3));
    }

      @Test
    void testDividePositiveDividendPositiveDivisor() {
        assertEquals(10, LongDivision.divide(105,10));
    }

}
