package com.acesoft.binarysearch;

/*
 * https://binarysearch.com/problems/Nth-Fibonacci-Number
 *
 * The Fibonacci sequence goes like this: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 *
 * The next number can be found by adding up the two numbers before it, and the first two numbers
 * are always 1.
 *
 * Write a function that takes an integer n and returns the nth Fibonacci number in the sequence.
 *
 * Constraints
 * n ≤ 30
 *
 * Example 1
 * Input
 * n = 1
 * Output
 * 1
 * Explanation
 * This is the base case and the first fibonacci number is defined as 1.
 *
 * Example 2
 * Input
 * n = 6
 * Output
 * 8
 * Explanation
 * Since 8 is the 6th fibonacci number: 1, 1, 2, 3, 5, 8.
 *
 * Example 3
 * Input
 * n = 7
 * Output
 * 13
 * Explanation
 * Since 13 is the seventh number: 1, 1, 2, 3, 5, 8, 13
 */
public class BinarySearch56 {

    public int solve(int n) {
        if (n < 3) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int i, x = 2, y = 3, sum;
        for (i = 0; i < n - 4; i++) {
            sum = x + y;
            x = y;
            y = sum;
        }
        return y;
    }
}