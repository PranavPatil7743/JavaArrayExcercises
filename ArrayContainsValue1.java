public class ArrayContainsValue1 {

    public static void main(String[] args) {
        int[] arr = {2444, 57, 7743, 98797, 34, 6, 1999, 8787};
        boolean value = containsValue(arr, 1);
        System.out.println(value);
    }

    public static boolean containsValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
