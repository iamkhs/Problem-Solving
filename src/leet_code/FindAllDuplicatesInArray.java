package leet_code;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    private static List<Integer> findDuplicates(int[] nums) {
        // Initialize the list of duplicates.
        List<Integer> list = new ArrayList<>();

        // Iterate through the elements in the nums array.
        int i = 0;
        while(i < nums.length){
            // Calculate the current element's index.
            int current = nums[i] - 1;

            // If the current element is not equal to the element at the calculated index,
            // swap the current element with the element at the calculated index.
            if (nums[i] != nums[current]){
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            }
            // If the current element is equal to the element at the calculated index,
            // move on to the next element.
            else {
                i++;
            }
        }

        // Iterate through the elements in the nums array again.
        for (int index = 0; index< nums.length; index++){
            // If the current element is not equal to its index+1, add it to the list of duplicates.
            if (index+1 != nums[index]){
                list.add(nums[index]);
            }
        }
        // Return the list of duplicates.
        return list;
    }

}
