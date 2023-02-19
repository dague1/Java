package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LongDivisionTest {

    @Test
    void checkCoverage() {
      boolean[] coverageFlags = new boolean[19];
      for(boolean flag : coverageFlags)
        flag = false;

      testOne(coverageFlags);
      testTwo(coverageFlags);
      testThree(coverageFlags);
       
      for(int i=0;i<coverageFlags.length;i++) {
        System.out.println("Branch " + i + ": " + coverageFlags[i]);
      }
    }
	
    @Test
    void testOne(boolean[] coverageFlags) {
        assertEquals(3, LongDivision.divide(10,3,coverageFlags));
    }
  
      @Test
    void testTwo(boolean[] coverageFlags) {
        assertEquals(-2, LongDivision.divide(7,-3,coverageFlags));
    }
  
  
      @Test
    void testThree(boolean[] coverageFlags) {
        assertEquals(10, LongDivision.divide(105,10,coverageFlags));
    }
	
}
