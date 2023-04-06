package leet_code;
// https://leetcode.com/problems/most-frequent-even-element/description/

import java.util.*;
public class MostFrequentEvenElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{0,1,2,2,4,4,1}));
    }
    public static int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(i % 2 ==0){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        int ans = -1;
        int maxFreq = -1;
        for(int i : list){
            if(map.get(i) > maxFreq){
                ans = i;
                maxFreq = map.get(i);
            }
            else if(map.get(i) == maxFreq && ans > i){
                ans = i;
            }
        }
        return ans;
    }
}
