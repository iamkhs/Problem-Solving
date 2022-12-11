package leet_code;

import java.util.Arrays;
// https://leetcode.com/problems/set-mismatch/description/
public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    private static int[] findErrorNums(int[] nums) {
        // Cyclic Sort Algorithm
        int i = 0;
        while (i < nums.length){
            int current  = nums[i] -1;
            if (nums[i] != nums[current]){
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            }
            else i++;
        }

        for (int index = 0; index< nums.length; index++){
            if (index+1 != nums[index] ){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1,-1};
    }
}
