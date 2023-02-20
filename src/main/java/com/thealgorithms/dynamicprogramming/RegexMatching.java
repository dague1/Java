package com.thealgorithms.dynamicprogramming;

/**
 * Given a text and wildcard pattern implement a wildcard pattern matching
 * algorithm that finds if wildcard is matched with text. The matching should
 * cover the entire text ?-> matches single characters *-> match the sequence of
 * characters
 *
 */
/**
 * For calculation of Time and Space Complexity. Let N be length of src and M be
 * length of pat
 *
 */
public class RegexMatching {

    private static boolean[] coverageDivideFlags2arg = new boolean[7];
    private static boolean[] coverageDivideFlags4arg = new boolean[7];
    private static boolean[] coverageDivideFlags5arg = new boolean[8];

    public static boolean[] getCoverageDivideFlags2arg() {
        return coverageDivideFlags2arg;
    }
    public static boolean[] getCoverageDivideFlags4arg() {
        return coverageDivideFlags4arg;
    }
    public static boolean[] getCoverageDivideFlags5arg() {
        return coverageDivideFlags5arg;
    }

    // Method 1: Using Recursion
    // Time Complexity=0(2^(N+M)) Space Complexity=Recursion Extra Space
    static boolean regexRecursion(String src, String pat) {
        if (src.length() == 0 && pat.length() == 0) {
            coverageDivideFlags2arg[0] = true;
            return true;
        }
        if (src.length() != 0 && pat.length() == 0) {
            coverageDivideFlags2arg[1] = true;
            return false;
        }
        if (src.length() == 0 && pat.length() != 0) {
            coverageDivideFlags2arg[2] = true;
            for (int i = 0; i < pat.length(); i++) {
                if (pat.charAt(i) != '*') {
                    coverageDivideFlags2arg[3] = true;
                    return false;
                }
            }
            return true;
        }
        char chs = src.charAt(0);
        char chp = pat.charAt(0);

        String ros = src.substring(1);
        String rop = pat.substring(1);

        boolean ans;
        if (chs == chp || chp == '?') {
            coverageDivideFlags2arg[4] = true;
            ans = regexRecursion(ros, rop);
        } else if (chp == '*') {
            coverageDivideFlags2arg[5] = true;
            boolean blank = regexRecursion(src, rop);
            boolean multiple = regexRecursion(ros, pat);
            ans = blank || multiple;
        } else {
            coverageDivideFlags2arg[6] = true;
            ans = false;
        }
        return ans;
    }

    // Method 2: Using Recursion and breaking string using virtual index
    // Time Complexity=0(2^(N+M)) Space Complexity=Recursion Extra Space
    static boolean regexRecursion(
        String src,
        String pat,
        int svidx,
        int pvidx
    ) {
        if (src.length() == svidx && pat.length() == pvidx) {
            coverageDivideFlags4arg[0] = true;
            return true;
        }
        if (src.length() != svidx && pat.length() == pvidx) {
            coverageDivideFlags4arg[1] = true;
            return false;
        }
        if (src.length() == svidx && pat.length() != pvidx) {
            coverageDivideFlags4arg[2] = true;
            for (int i = pvidx; i < pat.length(); i++) {
                if (pat.charAt(i) != '*') {
                    coverageDivideFlags4arg[3] = true;
                    return false;
                }
            }
            return true;
        }
        char chs = src.charAt(svidx);
        char chp = pat.charAt(pvidx);

        boolean ans;
        if (chs == chp || chp == '?') {
            coverageDivideFlags4arg[4] = true;
            ans = regexRecursion(src, pat, svidx + 1, pvidx + 1);
        } else if (chp == '*') {
            coverageDivideFlags4arg[5] = true;
            boolean blank = regexRecursion(src, pat, svidx, pvidx + 1);
            boolean multiple = regexRecursion(src, pat, svidx + 1, pvidx);
            ans = blank || multiple;
        } else {
            coverageDivideFlags4arg[6] = true;
            ans = false;
        }
        return ans;
    }

    // Method 3: Top-Down DP(Memoization)
    // Time Complexity=0(N*M) Space Complexity=0(N*M)+Recursion Extra Space
    static boolean regexRecursion(
        String src,
        String pat,
        int svidx,
        int pvidx,
        int[][] strg
    ) {
        if (src.length() == svidx && pat.length() == pvidx) {
            coverageDivideFlags5arg[0] = true;
            return true;
        }
        if (src.length() != svidx && pat.length() == pvidx) {
            coverageDivideFlags5arg[1] = true;
            return false;
        }
        if (src.length() == svidx && pat.length() != pvidx) {
            coverageDivideFlags5arg[2] = true;
            for (int i = pvidx; i < pat.length(); i++) {
                if (pat.charAt(i) != '*') {
                    coverageDivideFlags5arg[3] = true;
                    return false;
                }
            }
            return true;
        }
        if (strg[svidx][pvidx] != 0) {
            coverageDivideFlags5arg[4] = true;
            return strg[svidx][pvidx] == 1 ? false : true;
        }
        char chs = src.charAt(svidx);
        char chp = pat.charAt(pvidx);

        boolean ans;
        if (chs == chp || chp == '?') {
            coverageDivideFlags5arg[5] = true;
            ans = regexRecursion(src, pat, svidx + 1, pvidx + 1, strg);
        } else if (chp == '*') {
            coverageDivideFlags5arg[6] = true;
            boolean blank = regexRecursion(src, pat, svidx, pvidx + 1, strg);
            boolean multiple = regexRecursion(src, pat, svidx + 1, pvidx, strg);
            ans = blank || multiple;
        } else {
            coverageDivideFlags5arg[7] = true;
            ans = false;
        }
        strg[svidx][pvidx] = ans == false ? 1 : 2;
        return ans;
    }

    // Method 4: Bottom-Up DP(Tabulation)
    // Time Complexity=0(N*M) Space Complexity=0(N*M)
    static boolean regexBU(String src, String pat) {
        boolean strg[][] = new boolean[src.length() + 1][pat.length() + 1];
        strg[src.length()][pat.length()] = true;
        for (int row = src.length(); row >= 0; row--) {
            for (int col = pat.length() - 1; col >= 0; col--) {
                if (row == src.length()) {
                    if (pat.charAt(col) == '*') {
                        strg[row][col] = strg[row][col + 1];
                    } else {
                        strg[row][col] = false;
                    }
                } else {
                    char chs = src.charAt(row);
                    char chp = pat.charAt(col);

                    boolean ans;
                    if (chs == chp || chp == '?') {
                        ans = strg[row + 1][col + 1];
                    } else if (chp == '*') {
                        boolean blank = strg[row][col + 1];
                        boolean multiple = strg[row + 1][col];
                        ans = blank || multiple;
                    } else {
                        ans = false;
                    }
                    strg[row][col] = ans;
                }
            }
        }
        return strg[0][0];
    }

    public static void main(String[] args) {
        String src = "aa";
        String pat = "*";
        System.out.println("Method 1: " + regexRecursion(src, pat));
        System.out.println("Method 2: " + regexRecursion(src, pat, 0, 0));
        System.out.println(
            "Method 3: " +
            regexRecursion(src, pat, 0, 0, new int[src.length()][pat.length()])
        );
        System.out.println("Method 4: " + regexBU(src, pat));
    }
}
// Memoization vs Tabulation : https://www.geeksforgeeks.org/tabulation-vs-memoization/
// Question Link : https://practice.geeksforgeeks.org/problems/wildcard-pattern-matching/1
