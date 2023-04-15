package leet_code;
// https://leetcode.com/problems/find-pivot-index/description/
public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{
                1,7,3,6,5,6
        }));
    }
    private static int pivotIndex(int[] nums) {
        int[] leftSum = prefixSum(nums, true);
        int[] rightSum = prefixSum(nums, false);

        for(int i = 0; i<nums.length; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }

    private static int[] prefixSum(int[] nums, boolean isLeft){
        // boolean true mean leftSum else right sum
        int[] prefSum = new int[nums.length];
        int sum = 0;
        if(isLeft){
            for(int i = 0; i<nums.length; i++){
                sum+=nums[i];
                prefSum[i] = sum;
            }
        }else{
            for(int i = nums.length-1; i>=0; i--){
                sum+=nums[i];
                prefSum[i] = sum;
            }
        }

        return prefSum;
    }
}
