package leet_code;
// https://leetcode.com/problems/first-missing-positive/

import java.util.ArrayList;
import java.util.HashSet;

public class FirstMissingPositiveNum {
    public static void main(String[] args) {
        int [] nums = {1,2,0};
        System.out.println(missingPositiveNum(nums));
    }

    private static int missingPositiveNum(int[] nums){

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : nums){
            arrayList.add(i);
        }

        HashSet<Integer> set = new HashSet<>(arrayList);
        for (int i = 1; i<=nums.length+1; i++){
            if (!set.contains(i)){
                return i;
            }
        }
        return 1;
    }
}
