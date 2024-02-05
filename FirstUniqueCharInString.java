import java.util.HashMap;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0
Example 2:
Input: s = "loveleetcode"
Output: 2
Example 3:
Input: s = "aabb"
Output: -1
 */
public class FirstUniqueCharInString {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
/*
getOrDefault--> Let's imagine you have a box of candies, and each candy represents a character in a string. The goal is to count how many candies of each type you have.

Now, you can use a paper to keep track of the count for each type of candy. Let's say you want to know how many candies of a specific type (let's call it 'A') you have. You look at your paper, and if you already wrote down the count for type 'A', you get that count. But if you haven't written anything for type 'A' yet, you decide to assume the count is zero.

In Java, the `getOrDefault` method is like checking your paper. It says, "Give me the count for type 'A', but if you haven't counted any yet, just tell me it's zero." It helps you avoid getting an error if you ask for the count of something you haven't counted before.

In the context of the code, when we say `frequencyMap.getOrDefault(c, 0) + 1`, it means: "Get me the count for the character 'c', but if 'c' hasn't been counted yet, assume the count is zero. Then, add 1 to the count because we found a new candy of type 'c'."

I hope this analogy helps you understand what `getOrDefault` does in a simple way!
 */