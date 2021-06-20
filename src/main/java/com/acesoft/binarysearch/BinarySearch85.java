package com.acesoft.binarysearch;

/*
 * https://binarysearch.com/problems/Sum-of-the-Digits
 *
 * Given a positive integer num, return the sum of its digits.
 *
 * Bonus: Can you do it without using strings?
 *
 * Constraints
 * 0 ≤ num < 2 ** 31
 *
 * Example 1
 * Input
 * num = 123
 * Output
 * 6
 * Explanation
 * Since 6 = 1 + 2 + 3
 *
 * Example 2
 * Input
 * num = 50
 * Output
 * 5
 * Explanation
 * Since 5 = 5 + 0
 */
public class BinarySearch85 {

    public int solve(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}