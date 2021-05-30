package com.acesoft.binarysearch;

/*
 * https://binarysearch.com/problems/Consecutive-Duplicates
 * 
 * Given a string s, consisting of "X" and "Y"s, delete the minimum number of characters such that
 * there's no consecutive "X" and no consecutive "Y".
 * 
 * Constraints
 * n ≤ 100,000 where n is the length of s
 * 
 * Example 1
 * Input
 * s = "YYYXYXX"
 * Output
 * "YXYX"
 * Explanation
 * One solution is to delete the first two "Y"s and the last "X".
 */
public class BinarySearch139 {

    public String solve(String s) {
        StringBuilder sb = new StringBuilder();
        char lastSeen = ' ';
        for (char ch : s.toCharArray()) {
            if (lastSeen == ch) {
                continue;
            }
            sb.append(ch);
            lastSeen = ch;
        }
        return sb.toString();
    }
}