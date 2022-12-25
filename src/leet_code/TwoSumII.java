package leet_code;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[]numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        // Initialize two pointers, i and j, to the beginning and end of the array, respectively.
        int i = 0;
        int j = nums.length -1;

        // While i is less than j, do the following:
        while(i < j){
            // Calculate the sum of nums[i] and nums[j].
            int sum = nums[i] + nums[j];

            // If the sum is equal to the target, return the indices i + 1 and j + 1 as the result.
            if (sum == target){
                return new int[]{i+1, j+1};
            }
            // If the sum is greater than the target, decrement j by 1.
            else if(sum > target){
                j--;
            }
            // If the sum is less than the target, increment i by 1.
            else i++;
        }
        // If no solution is found, return an array containing -1.
        return new int[]{-1};
    }
}
