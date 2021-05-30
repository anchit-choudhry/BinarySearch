package com.acesoft.binarysearch;

import java.util.HashSet;
import java.util.Set;

/*
 * https://binarysearch.com/problems/A-Unique-String
 * 
 * Given a lowercase alphabet string s, determine whether it has all unique characters.
 * 
 * Constraints
 * 0 ≤ n ≤ 100,000 where n is the length of s
 * 
 * Example 1
 * Input
 * s = "abcde"
 * Output
 * true
 * Explanation
 * All characters only occur once
 * 
 * Example 2
 * Input
 * s = "aab"
 * Output
 * false
 * Explanation
 * There's two as
 * 
 * Example 3
 * Input
 * s = ""
 * Output
 * true
 * Explanation
 * All characters occur once (of which there are none)
 */
public class BinarySearch28 {

    public boolean solve(String s) {
        Set<Character> hs = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (!hs.add(ch)) {
                return false;
            }
        }
        return true;
    }
}