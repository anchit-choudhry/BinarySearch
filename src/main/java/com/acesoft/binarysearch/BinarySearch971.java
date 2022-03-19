package com.acesoft.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * https://binarysearch.com/problems/Mutual-Followers
 *
 * You are given a two-dimensional list of integers relations. Each element relations[i] contains
 * [a, b] meaning that person a is following person b on Twitter.
 *
 * Return the list of people who follow someone that follows them back, sorted in ascending order.
 *
 * Constraints
 * 0 ≤ n ≤ 100,000 where n is the length of relations
 *
 * Example 1
 * Input
 * relations = [
 *     [0, 1],
 *     [2, 3],
 *     [3, 4],
 *     [1, 0]
 * ]
 * Output
 * [0, 1]
 * Explanation
 * 0 follows 1 and 1 follows 0.
 *
 * Example 2
 * Input
 * relations = [
 *     [0, 1],
 *     [1, 2],
 *     [2, 3],
 *     [3, 0]
 * ]
 * Output
 * []
 * Explanation
 * There aren't any mutual followers.
 */
public class BinarySearch971 {

    public int[] solve(int[][] relations) {
        Set<String> hs = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int[] relation : relations) {
            String abc = relation[0] <= relation[1]
                    ? String.valueOf(relation[0]) + String.valueOf(relation[1])
                    : String.valueOf(relation[1]) + String.valueOf(relation[0]);
            if (!hs.add(abc)) {
                result.add(relation[0]);
                result.add(relation[1]);
            }
        }
        int[] arr = result.stream().mapToInt(x -> x).toArray();
        Arrays.sort(arr);
        return arr;
    }
}