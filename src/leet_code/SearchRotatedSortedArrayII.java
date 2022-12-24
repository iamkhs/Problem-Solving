package leet_code;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
import java.util.*;

public class SearchRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 5;
        System.out.println(binarySearch(nums,target));
    }

    //Brute force Approach with 1ms
    private static boolean search(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        return list.contains(target);
    }

    // Binary Search but with 2ms
    private static boolean binarySearch(int[] nums, int target){
        Arrays.sort(nums);
        int start = 0;
        int end  = nums.length-1;

        while(start<= end){
            int mid = start + (end - start)/ 2;
            if (nums[mid] == target){
                return true;
            }
            if (nums[mid] > target){
                end = mid-1;
            }
            else start = mid +1;
        }
        return false;
    }
}
