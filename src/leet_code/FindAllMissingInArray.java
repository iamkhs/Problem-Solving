package leet_code;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class FindAllMissingInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        // Set the starting index to 0
        int i = 0;

        // Keep looping until the index reaches the end of the array
        while(i < nums.length){
            // Calculate the index of the element that should be at the current index
            int current = nums[i] - 1;

            // If the element at the current index is not in the correct position,
            // swap it with the element that should be at the current index
            if (nums[i] != nums[current]){
                int temp = nums[i];
                nums[i] = nums[current];
                nums[current] = temp;
            }
            // If the element at the current index is in the correct position,
            // move on to the next index
            else i++;
        }

        // Create an array list to store the missing numbers
        List<Integer> arraylist = new ArrayList<>();

        // Iterate over the array
        for (int index = 0; index< nums.length; index++){
            // If the current index plus 1 is not equal to the value at the current index,
            // it means that the number at that index is missing from the array, so
            // we add it to the list of missing numbers
            if (index+1 != nums[index]){
                arraylist.add(index+1);
            }
        }
        // Return the list of missing numbers
        return arraylist;
    }
}

