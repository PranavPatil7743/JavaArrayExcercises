public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        System.out.println(findMaxSubArraySum(arr));
    }

    //USING KADANE'S ALGORITHM

    static int findMaxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
