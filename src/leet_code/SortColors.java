package leet_code;
// https://leetcode.com/problems/sort-colors/description/
import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Using Insertion Sort Algorithm with 2ms Solution
    private static void sortColors2(int [] nums){
        for (int i = 0; i< nums.length-1; i++){
            for (int j = i+1; j>0; j--){
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else break;
            }
        }
    }

    // Using Bubble Sort Algorithm with 3ms Solution
    private static void sortColors3(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            boolean swapped = false;
            for(int j = 1; j<nums.length-i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    // Using Selection Sort with 5ms Solution
    private static void sortColors(int[] nums){
        for (int i = 0; i< nums.length-1; i++){
            int min = i;
            for (int j = i+1; j< nums.length; j++){
                if (nums[j] < nums[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
