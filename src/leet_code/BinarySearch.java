package leet_code;

public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 6, 10, 15, 20, 24};
        int target = 15;
        int ans = search(nums, target);
        System.out.println(ans);
    }

    // Binary Search Algorithm
    // time complexity O(long n) with less memory use
    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
