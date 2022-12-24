package leet_code;
// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }

    // Optimized Solution using Binary Search Time complexity O(logN)
    private static int singleNonDuplicate(int[] nums) {
        int start = 0;  // Initialize start pointer to the start of the array
        int end = nums.length - 1;  // Initialize end pointer to the end of the array

        // Loop as long as start pointer is less than end pointer
        while (start < end) {
            int mid = start + (end - start) / 2;  // Calculate midpoint of array

            if (mid % 2 == 0) {  // If midpoint is even
                if (nums[mid] == nums[mid + 1]) {  // If element at midpoint is a duplicate
                    start = mid + 1;  // Search right half of array
                } else {
                    end = mid;  // Search left half of array
                }
            } else {  // If midpoint is odd
                if (nums[mid] == nums[mid - 1]) {  // If element at midpoint is a duplicate
                    start = mid + 1;  // Search right half of array
                } else {
                    end = mid;  // Search left half of array
                }
            }
        }
        return nums[start];  // Return element at start pointer
    }

    // Brute force Approach using Linear Search Algorithm Time Complexity O(n)
    private static int singleNonDuplicate2(int[] nums) {
        int i = 0;
        int j = 1;

        while(i<=j){
            if (nums[i] != nums[j]){
                return nums[i];
            }
            i+=2;
            j+=2;
        }
        return -1;
    }
}
