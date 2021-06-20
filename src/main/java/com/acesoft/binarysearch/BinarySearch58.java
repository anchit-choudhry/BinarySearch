package com.acesoft.binarysearch;

import java.util.HashMap;
import java.util.Map;

/*
 * https://binarysearch.com/problems/High-Frequency
 *
 * Given a list of integers nums, find the most frequently occurring element and return the number
 * of occurrences of that element.
 *
 * Constraints
 * 0 ≤ n ≤ 100,000 where n is the length of nums
 *
 * Example 1
 * Input
 * nums = [1, 4, 1, 7, 1, 7, 1, 1]
 * Output
 * 5
 *
 * Example 2
 * Input
 * nums = [5, 5, 5, 5, 5, 5, 5]
 * Output
 * 7
 *
 * Example 3
 * Input
 * nums = [1, 2, 3, 4, 5, 6, 7]
 * Output
 * 1
 */
public class BinarySearch58 {

    public int solve(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int freq = 0;
        for (Map.Entry<Integer, Integer> kv : hm.entrySet()) {
            if (kv.getValue() > freq) {
                freq = kv.getValue();
            }
        }
        return freq;
    }
}