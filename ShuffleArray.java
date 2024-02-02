/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
 */

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];

        // Iterate through the array and perform the shuffle
        for (int i = 0, j = n, k = 0; k < 2 * n; k++) {
            // If k is even, take an element from the first half (xi)
            if (k % 2 == 0) {
                result[k] = nums[i++];
            } else {
                // If k is odd, take an element from the second half (yi)
                result[k] = nums[j++];
            }
        }
        return result;
    }
}
/*
Iteration	k	nums[i]	 nums[j]	result
1	        0	  2	        3	    [2, 0, 0, 0, 0, 0]
2	        1	  5	        4	    [2, 5, 0, 0, 0, 0]
3	        2	  1	        7	    [2, 5, 1, 0, 0, 0]
4	        3	  3	        -	    [2, 5, 1, 3, 0, 0]
5	        4	  4	        -	    [2, 5, 1, 3, 4, 0]
6	        5	  7	        -	    [2, 5, 1, 3, 4, 7]
 */

