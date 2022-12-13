package leet_code;

import java.util.Arrays;
// https://leetcode.com/problems/sort-array-by-parity/description/
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    // Efficient solution O(n) time complexity
    private static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            if (nums[j] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
        return nums;
    }

    // Brute Force Approach
    private static int[] sortArrayByParity2(int[] nums) {
        for (int i = 0; i< nums.length-1; i++){
            for (int j = i+1; j< nums.length; j++){
                if (nums[j] % 2 == 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }return nums;
    }
}
