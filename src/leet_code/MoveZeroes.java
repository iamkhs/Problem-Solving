package leet_code;
// https://leetcode.com/problems/move-zeroes/description/
import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,1,1,1};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }

    // Using Two Pointer Approach
    private static void moveZeros(int[] nums) {
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if (nums[j] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
            j++;
        }
    }
}
