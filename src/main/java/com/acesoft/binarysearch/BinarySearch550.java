package com.acesoft.binarysearch;

/*
 * https://binarysearch.com/problems/Unique-Integers-in-Sorted-List
 *
 * Given a list of sorted integers nums return the number of unique integers in the list.
 *
 * Constraints
 * n ≤ 1,000,000 where n is the length of nums
 *
 * Notes
 * \mathcal{O}(n)O(n) is accepted but \mathcal{O}(k\log{}n)O(klogn) is encouraged.
 *
 * Example 1
 * Input
 * nums = [2, 2, 2, 3, 4, 6, 6]
 * Output
 * 4
 * Explanation
 * The unique numbers are [2, 3, 4, 6]
 */
public class BinarySearch550 {

    public int solve(int[] nums) {
        int i, diffs = 0;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                diffs++;
            }
        }
        return diffs + 1;
    }
}