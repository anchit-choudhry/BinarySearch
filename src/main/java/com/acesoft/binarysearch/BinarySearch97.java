package com.acesoft.binarysearch;

/*
 * https://binarysearch.com/problems/Check-Palindrome
 * 
 * Given a string s, return whether it is a palindrome.
 * 
 * Constraints
 * n ≤ 100,000 where n is the length of s
 * 
 * Example 1
 * Input
 * s = "racecar"
 * Output
 * true
 * 
 * Example 2
 * Input
 * s = "evilolive"
 * Output
 * true
 * 
 * Example 3
 * Input
 * s = "palindrome"
 * Output
 * false
 */
public class BinarySearch97 {

    public boolean solve(String s) {
        int len = s.length(), i;
        for (i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}