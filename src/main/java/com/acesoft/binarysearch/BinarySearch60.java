package com.acesoft.binarysearch;

import java.util.Arrays;

/*
 * https://binarysearch.com/problems/Square-of-a-List
 * 
 * Given a list of integers sorted in ascending order nums, square the elements and give the output
 * in sorted order.
 * 
 * Constraints
 * n ≤ 100,000 where n is the length of nums
 * 
 * Example 1
 * Input
 * nums = [-9, -2, 0, 2, 3]
 * Output
 * [0, 4, 4, 9, 81]
 * 
 * Example 2
 * Input
 * nums = [1, 2, 3, 4, 5]
 * Output
 * [1, 4, 9, 16, 25]
 */
public class BinarySearch60 {

    public int[] solve(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            arr[i++] = num * num;
        }
        Arrays.sort(arr);
        return arr;
    }
}