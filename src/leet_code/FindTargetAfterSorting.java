package leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/find-target-indices-after-sorting-array/
public class FindTargetAfterSorting {
    public static void main(String[] args) {
        int []nums = {1,2,5,2,3};
        int target = 3;
        System.out.println(targetIndices(nums,target));
    }

    private static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == target) arrayList.add(i);
        }
        return arrayList;
    }
}
