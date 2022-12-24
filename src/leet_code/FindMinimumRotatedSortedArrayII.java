package leet_code;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
import java.util.Arrays;

public class FindMinimumRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 0, 1};
        System.out.println(findMin(nums));
    }
    private static int findMin(int[] nums) {
        Arrays.sort(nums);
        return binarySearch(nums);
    }

    // 2ms Solution using Binary Search Algorithm
    private static int binarySearch(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start + (end - start)/ 2;
            if(nums[mid] > nums[end]){
                start = mid+1;
            }
            else end = mid;
        }

        return nums[end];
    }
}
