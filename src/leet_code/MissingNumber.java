package leet_code;
// https://leetcode.com/problems/missing-number/
import java.util.HashSet;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    private static int missingNumber(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }

        for (int i = 0; i<=nums.length; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return 0;
    }

    // Another Approach using Cyclic Sort Algorithm with 1ms most efficient solution
    private static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int current = nums[i]-1;
            if (nums[i]>0 && nums[i] < nums.length && nums[i] != nums[current]){
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            }
            else i++;
        }

        for (int index = 0; index< nums.length; index++){
            if (index+1 != nums[index]){
                return index+1;
            }
        }
        return nums.length+1;
    }

}
