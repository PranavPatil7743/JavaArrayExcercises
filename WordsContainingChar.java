import java.util.ArrayList;
import java.util.List;

/*
You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.

Example 1:
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
Example 2:
Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
Example 3:
Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
Output: []
Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 */
public class WordsContainingChar {
    public static void main(String[] args) {
        WordsContainingChar wordsContainingChar = new WordsContainingChar();
        String[] words = {"leet","code"};
        char x = 'e';
        List<Integer> result = wordsContainingChar.findWordsContaining(words, x);
        System.out.println(result);
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (containsChar(words[i], x)) {
                indices.add(i);
            }
        }
        return indices;
    }

    private boolean containsChar(String word, char x) {
        for (char c : word.toCharArray()) {
            if (c == x) {
                return true;
            }
        }
        return false;
    }
}
