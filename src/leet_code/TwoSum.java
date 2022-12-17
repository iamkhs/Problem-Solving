package leet_code;
// https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ans = twoSum2(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    // Brute Force Approach, NOT optimized!! time Complexity O(n^2)
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i< nums.length; i++){
            for (int j = i + 1; j< nums.length; j++){
                if (nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }


    // Efficient Solution using HashMap with Time Complexity O(n)
    private static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<nums.length; i++){
            int value = target - nums[i];
            if (map.containsKey(value)){
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1};
    }
}
