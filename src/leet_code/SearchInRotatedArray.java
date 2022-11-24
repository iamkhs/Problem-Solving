package leet_code;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedArray {
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 1;

        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return binarySearch(nums,target, 0, nums.length-1);
        }
        else if (nums[pivot] == target){
            return pivot;
        }
        else if (target >= nums[0]){
            return binarySearch(nums, target,0,pivot - 1);
        }

        else{
            return binarySearch(nums,target, pivot+1, nums.length-1);
        }
    }

    private static int binarySearch(int [] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if (target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // 4 cases over here
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[start] >= arr[mid]){
                end = mid -1;
            }
            else start = mid +1;
        }
        return -1;
    }
}
