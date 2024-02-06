/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */

import java.util.HashMap;
import java.util.Map;

public class ValidAnagrams {
    public static void main(String[] args) {
        ValidAnagrams validAnagrams = new ValidAnagrams();
        System.out.println(validAnagrams.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Initialize a HashMap to count characters
        Map<Character, Integer> countMap = new HashMap<>();

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Decrement counts for characters in the second string
        for (char c : t.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) - 1);

            // Remove the entry if the count becomes zero
            if (countMap.get(c) == 0) {
                countMap.remove(c);
            }
        }

        // If the HashMap is empty, the strings are anagrams
        return countMap.isEmpty();
    }
}

