//        Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
//
//        The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, 
//        and -2.7335 would be truncated to -2.
//        My method used Long Division, here is the source "https://en.wikipedia.org/wiki/Long_division"

package com.thealgorithms.maths;

public class LongDivision {
public static int divide(int dividend, int divisor, boolean[] coverageFlags) {
        long new_dividend_1 = dividend;
        long new_divisor_1 = divisor;

        if (dividend < 0) {
            //BRANCH ID 0
            coverageFlags[0] = true;
            //===========
            new_dividend_1 = new_dividend_1 * -1;
        } else {
            //BRANCH ID 1
            coverageFlags[1] = true;
            //===========
        }
        if (divisor < 0) {
            //BRANCH ID 2
            coverageFlags[2] = true;
            //===========
            new_divisor_1 = new_divisor_1 * -1;
        } else {
            //BRANCH ID 3
            coverageFlags[3] = true;
            //===========
        }

        if (dividend == 0 || new_dividend_1 < new_divisor_1) {
            //BRANCH ID 4
            coverageFlags[4] = true;
            //===========
            return 0;
        } else {
            //BRANCH ID 5
            coverageFlags[5] = true;
            //===========
        }

        StringBuilder answer = new StringBuilder();

        String dividend_string = "" + new_dividend_1;
        int last_index = 0;

        String remainder = "";


        for (int i = 0; i < dividend_string.length(); i++) {
            String part_v1 = remainder + "" + dividend_string.substring(last_index, i + 1);
            long part_1 = Long.parseLong(part_v1);
            if (part_1 > new_divisor_1) {
                //BRANCH ID 6
                coverageFlags[6] = true;
                //===========
                int quotient = 0;
                while (part_1 >= new_divisor_1) {
                    //BRANCH ID 7
                    coverageFlags[7] = true;
                    //===========
                    part_1 = part_1 - new_divisor_1;
                    quotient++;
                }
                answer.append(quotient);
            } else if (part_1 == new_divisor_1) {
                //BRANCH ID 8
                coverageFlags[8] = true;
                //===========
                int quotient = 0;
                while (part_1 >= new_divisor_1) {
                    //BRANCH ID 9
                    coverageFlags[9] = true;
                    //===========
                    part_1 = part_1 - new_divisor_1;
                    quotient++;
                }
                answer.append(quotient);
            } else if (part_1 == 0) {
                //BRANCH ID 10
                coverageFlags[10] = true;
                //===========
                answer.append(0);
            } else if (part_1 < new_divisor_1) {
                //BRANCH ID 11
                coverageFlags[11] = true;
                //===========
                answer.append(0);
            } else {
                //BRANCH ID 12
                coverageFlags[12] = true;
                //===========
            }

            if (!(part_1 == 0)) {
                //BRANCH ID 13
                coverageFlags[13] = true;
                //===========
                remainder = String.valueOf(part_1);
            }else{
                //BRANCH ID 14
                coverageFlags[14] = true;
                //===========
                remainder = "";
            }

            last_index++;
        }

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            //BRANCH ID 15
            coverageFlags[15] = true;
            //===========
            try {
                return Integer.parseInt(answer.toString()) * (-1);
            } catch (NumberFormatException e) {
                //BRANCH ID 16
                coverageFlags[16] = true;
                //===========
                return -2147483648;
            }
        } else {
            //BRANCH ID 17
            coverageFlags[17] = true;
            //===========
        }
        try {
            return Integer.parseInt(answer.toString());
        } catch (NumberFormatException e) {
            //BRANCH ID 18
            coverageFlags[18] = true;
            //===========
            return 2147483647;
        }

    }
}
