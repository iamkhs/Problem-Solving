package leet_code;
// https://leetcode.com/problems/intersection-of-two-arrays/description/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    // Optimized Solution with 2ms 99% Beats
    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1){
            set.add(i);
        }

        Set<Integer> ans = new HashSet<>();
        for (int j : nums2) {
            if (set.contains(j)) {
                ans.add(j);
                set.remove(j);
            }
        }

        int[] arr = new int[ans.size()];
        int i = 0;
        for (int e : ans){
            arr[i++] = e;
        }
        return arr;
    }
}
