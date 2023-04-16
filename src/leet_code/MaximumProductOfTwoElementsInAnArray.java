package leet_code;
import java.util.*;
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : nums){
            q.add(i);
        }
        int a = q.poll();
        int b = q.poll();

        return (a-1) * (b-1);
    }
}
