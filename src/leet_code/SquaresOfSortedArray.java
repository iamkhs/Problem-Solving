package leet_code;
// https://leetcode.com/problems/squares-of-a-sorted-array/description/
import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));

    }
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int square = nums[i] * nums[i];
            ans[i] = square;
        }
        Arrays.sort(ans);
        return ans;
    }
}
