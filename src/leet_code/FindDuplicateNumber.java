package leet_code;
// https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
    public static void main(String[] args){

        int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }

    // Using HashSet time complexity is BigO(n)
    public static int findDuplicate_set(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }
        return size;
    }

    // Linear search Algorithms time complexity is BigO(n^2)
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

}
