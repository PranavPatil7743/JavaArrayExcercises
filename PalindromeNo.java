public class PalindromeNo {
    public static void main(String[] args) {
        int num = 21;
        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        return reversed == x;
    }


}
