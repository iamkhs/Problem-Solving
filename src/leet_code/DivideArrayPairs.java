package leet_code;
// https://leetcode.com/problems/divide-array-into-equal-pairs/
import java.util.HashSet;

public class DivideArrayPairs {
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
    public static boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) set.remove(n);
            else set.add(n);
        }
        return set.isEmpty();
    }
}
