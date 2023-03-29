package leet_code;
// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
import java.util.*;
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        int[] ans = new int[list.size()];
        int k = 0;
        for(int l : list){
            ans[k++] = l;
        }
        return ans;
    }
}
