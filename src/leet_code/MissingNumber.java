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

}
