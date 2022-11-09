package leet_code;

import java.util.Arrays;

public class FindFirstLast {
    public static void main(String[] args){

        int[] nums = {5,7,7,8,8,10};
        int target = 8; // [3,4] index
        int [] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int []ans = {-1,-1};

        int start = search(nums, target, true);
        int last = search(nums, target, false);
        ans[0] = start;
        ans[1] = last;
        return ans;

    }

    private static int search(int [] nums, int target, boolean findStartedIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if (findStartedIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
