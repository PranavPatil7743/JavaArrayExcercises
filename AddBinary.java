/*
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"
Example 2:
Input: a = "1010", b = "1011"
Output: "10101"
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        AddBinary obj = new AddBinary();
        String result = obj.addBinary(a, b);
        System.out.println(result);
    }
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        // Perform binary addition digit by digit
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.append(sum % 2); // Append the least significant bit of the sum
            carry = sum / 2; // Update the carry for the next addition
        }

        // Reverse the result string
        result.reverse();

        return result.toString();
    }
}
