package com.acesoft.binarysearch;

import java.util.Arrays;

/*
 * https://binarysearch.com/problems/Max-Product-of-Two-Numbers
 *
 * Given a list of integers nums, find the largest product of two distinct elements.
 *
 * Constraints
 * n ≤ 100,000 where n is the length of nums
 *
 * Example 1
 * Input
 * nums = [5, 1, 7]
 * Output
 * 35
 * Explanation
 * 35 is the largest product that can be made from 5 * 7
 *
 * Example 2
 * Input
 * nums = [7, 1, 7]
 * Output
 * 49
 * Explanation
 * 49 is the largest product that can be made from 7 * 7. The values can be the same but they must
 * be separate elements.
 *
 * Example 3
 * Input
 * nums = [-5, 1, -7]
 * Output
 * 35
 * Explanation
 * 35 is the largest product that can be made from -5 * -7.
 */
public class BinarySearch100 {

    public int solve(int[] nums) {
        if (nums.length == 2) {
            return nums[0] * nums[1];
        }
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2], nums[0] * nums[1]);
    }
}