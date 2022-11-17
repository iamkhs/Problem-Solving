package leet_code;
import java.util.Arrays;
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class MinInRotatedArr {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(smartSolution(nums));
    }

    private static int binarySearch(int[] nums){
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start +(end - start) / 2;
            if (nums[mid] > nums[end]){
                start = mid +1;
            }
            else {
                end = mid;
            }
        }
        // return either end or start
        return nums[end];
    }

    // And Here is the Another Smart solution, but it's not recommended
    private static int smartSolution(int[] nums){
        Arrays.sort(nums);
        return nums[0];
    }
}
