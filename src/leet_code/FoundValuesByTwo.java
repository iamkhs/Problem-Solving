package leet_code;
// https://leetcode.com/problems/keep-multiplying-found-values-by-two/
public class FoundValuesByTwo {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
        System.out.println(findFinalValue2(nums,original));
    }

    // brute force approach less optimized!!
    private static int findFinalValue(int[] nums, int original) {
        for (int i = 0; i< nums.length; i++) {
            for (int num : nums) {
                if (num == original) {
                    original = original * 2;
                }
            }
        }
        return original;
    }

    // another method with optimized solution
    private static int findFinalValue2(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] == original){
                original = original*2;
                i = -1;
            }
        }
        return original;
    }
}
