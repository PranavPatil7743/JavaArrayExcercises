public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        mergeArray(nums1, nums2, m, n);
        for (int result : nums1) {
            System.out.print(result + " ");
        }
    }

    public static void mergeArray(int[] nums1, int[] nums2, int m, int n) {
        int i = m - 1; //pointer for i
        int j = n - 1; //pointer for j
        int k = m + n - 1; //pointer for merged array

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else
                nums1[k--] = nums2[j--];
        }
    }
}
