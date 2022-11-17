package leet_code;
// https://leetcode.com/problems/contains-duplicate/
import java.util.ArrayList;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] nums ={1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : nums){
            arrayList.add(i);
        }

        HashSet<Integer> set = new HashSet<>(arrayList);
        return arrayList.size() != set.size();


        // This is brute force approach

        /*
        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;

         */
    }
}
