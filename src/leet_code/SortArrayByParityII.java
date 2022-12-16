package leet_code;
// https://leetcode.com/problems/sort-array-by-parity-ii/description/
import java.util.Arrays;

public class SortArrayByParityII {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));

    }
    public static int[] sortArrayByParityII(int[] nums) {
        int even= 0;
        int odd = 1;
        int[] ans = new int[nums.length];

        for (int i : nums){
            if (i % 2 ==0){
                ans[even] = i;
                even+=2;
            }
            else{
                ans[odd] = i;
                odd+=2;
            }
        }
        return ans;
    }
}
