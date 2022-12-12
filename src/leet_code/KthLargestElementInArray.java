package leet_code;
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
import java.util.Arrays;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int [] arr = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(arr,k));
    }

    private static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
