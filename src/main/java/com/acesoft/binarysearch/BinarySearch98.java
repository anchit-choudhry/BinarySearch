package com.acesoft.binarysearch;

/*
 * https://binarysearch.com/problems/Anagram-Checks
 *
 * Given two strings s0 and s1, return whether they are anagrams of each other.
 *
 * Constraints
 * n ≤ 100,000 where n is the length of s0
 * m ≤ 100,000 where m is the length of s1
 *
 * Example 1
 * Input
 * s0 = "listen"
 * s1 = "silent"
 * Output
 * true
 *
 * Example 2
 * Input
 * s0 = "bedroom"
 * s1 = "bathroom"
 * Output
 * false
 */
public class BinarySearch98 {

    public boolean solve(String s0, String s1) {
        int[] alphabets = new int[26];
        for (char ch : s0.toCharArray()) {
            alphabets[ch - 'a']++;
        }
        for (char ch : s1.toCharArray()) {
            alphabets[ch - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (alphabets[i] != 0) {
                return false;
            }
        }
        return true;
    }
}