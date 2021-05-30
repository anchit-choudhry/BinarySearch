package com.acesoft.binarysearch;

/*
 * https://binarysearch.com/problems/Strictly-Increasing-or-Strictly-Decreasing
 * 
 * Given a list of integers nums, return whether the list is strictly increasing or strictly
 * decreasing.
 * 
 * Constraints
 * n ≤ 100,000 where n is the length of nums
 * 
 * Example 1
 * Input
 * nums = [1, 2, 3, 4, 5]
 * Output
 * true
 * Explanation
 * This is strictly increasing.
 * 
 * Example 2
 * Input
 * nums = [1, 2, 3, 4, 5, 5]
 * Output
 * false
 * Explanation
 * Since there's two duplicate 5 this is not strictly increasing.
 * 
 * Example 3
 * Input
 * nums = [5, 4, 3, 2, 1]
 * Output
 * true
 * Explanation
 * This is strictly decreasing.
 */
public class BinarySearch19 {

    public boolean solve(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int i;
        boolean ascFlag = true, descFlag = true;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ascFlag = false;
                break;
            }
        }
        if (ascFlag) {
            return true;
        }
        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i] >= nums[i - 1]) {
                descFlag = false;
                break;
            }
        }
        return descFlag;
    }
}