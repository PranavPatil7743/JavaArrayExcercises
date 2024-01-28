import java.util.Arrays;

/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        PlusOne solution = new PlusOne();
        int[] result = solution.plusOne(digits);

        // Print the result
        System.out.println(Arrays.toString(result));
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;

            // If the current digit becomes 10, set it to 0 and carry 1 to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // If the current digit is less than 10, no need to carry, stop the loop
                break;
            }
        }

        // After the loop, if the most significant digit became 10, add a new digit at the beginning
        if (digits[0] == 0) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }
}
