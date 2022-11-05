package leet_code;

public class SearchInsertPosition {
    public static void main(String[] args){

        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    // remove the static keyword and make it public for submit code on LeetCode
    // Binary Search Algorithm
    // O(log n) time complexity
    private static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
