/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
import java.util.HashMap;
import java.util.Map;
public class RomanToInteger {
    public int romanToInt(String s) {
        // Create a mapping of Roman numeral characters to their corresponding values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Iterate through the Roman numeral string from left to right
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current Roman numeral character
            int currentVal = romanMap.get(s.charAt(i));

            // If the current value is less than the next value, subtract it (e.g., IV for 4)
            if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                // Otherwise, add the current value to the result
                result += currentVal;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger solution = new RomanToInteger();
        String roman1 = "III";
        String roman2 = "IV";
        String roman3 = "IX";
        String roman4 = "LVIII";
        String roman5 = "MCMXCIV";

        System.out.println(solution.romanToInt(roman1)); // Output: 3
        System.out.println(solution.romanToInt(roman2)); // Output: 4
        System.out.println(solution.romanToInt(roman3)); // Output: 9
        System.out.println(solution.romanToInt(roman4)); // Output: 58
        System.out.println(solution.romanToInt(roman5)); // Output: 1994
    }
}

