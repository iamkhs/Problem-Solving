package leet_code;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexMountainArray {
    public static void main(String[] args){
        int [] arr = {0, 10, 5, 2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    // make it public before submitting the code and remove static keyword
    // Binary search Algorithm
    // Time complexity O(log n)
    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else if(arr[mid] > arr[mid+1]){
                end = mid;
            }
        }
        return start;
    }

}
