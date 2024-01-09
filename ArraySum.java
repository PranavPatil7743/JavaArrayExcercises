public class ArraySum {

    public static void main(String[] args) {
        int[] array = {20, 40, 40, 100};
        int sum = sumValuesOfArray(array);
        System.out.println(sum);
    }

    private static int sumValuesOfArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }
}
