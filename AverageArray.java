public class AverageArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int average = average(array);
        System.out.print(average);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int nums : array) {
            sum = sum + nums;
        }
        int average = sum / array.length;
        return average;
    }
}
