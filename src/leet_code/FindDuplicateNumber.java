package leet_code;
// https://leetcode.com/problems/find-the-duplicate-number/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumber {
    public static void main(String[] args){

        int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicateWithCyclicSort(nums));
    }

    // Using HashSet time complexity is BigO(n)
    private static int findDuplicate_set(int[] nums) {
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
    private static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

    // Cyclic Sort algorithm with BigO(n) time complexity more optimized
    private static int findDuplicateWithCyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int current = nums[i] - 1;
            if (nums[i] != nums[current]){
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            }
            else i++;
        }

        for (int index = 0; index< nums.length; index++){
            if (index+1 != nums[index]){
                return nums[index];
            }
        }
        return -1;
    }

}
