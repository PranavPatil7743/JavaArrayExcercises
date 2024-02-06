/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:
Input: strs = [""]
Output: [[""]]
Example 3:
Input: strs = ["a"]
Output: [["a"]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams.groupAnagrams(words);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public List<List<String>> groupAnagrams(String[] words) {
        // Initialize a HashMap to store groups of anagrams
        HashMap<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate over words
        for (String word : words) {
            // Convert the word to a char array, sort it, and convert it back to a string
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            // Group by sorted representation
            if (anagramGroups.containsKey(sortedWord)) {
                anagramGroups.get(sortedWord).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                anagramGroups.put(sortedWord, group);
            }
        }

        // Build the result by collecting values of the HashMap
        List<List<String>> result = new ArrayList<>(anagramGroups.values());

        return result;
    }
}
