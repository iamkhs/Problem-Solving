package leet_code;
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class CheckArraySorted {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        boolean isSorted = check(nums);
        System.out.println(isSorted);
    }

    private static boolean check(int[] arr) {
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > arr[(i+1) % arr.length]){
                count++;
            }
        }
        if(count > 1){
            return false;
        }
        return true;
    }

}
