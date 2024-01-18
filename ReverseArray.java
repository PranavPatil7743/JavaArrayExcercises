import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {11, 1, 12, 13, 14, 15};
        reverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // USING TWO POINTERS o(n); else we can use two for loops o(n^2)
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int swap = arr[start];
            arr[start] = arr[end];
            arr[end] = swap;
            start++;
            end--;
        }
    }
}
