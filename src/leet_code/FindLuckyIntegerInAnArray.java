package leet_code;
// https://leetcode.com/problems/find-lucky-integer-in-an-array/description/
import java.util.*;

public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) == i){
                list.add(i);
            }
        }
        int max = -1;
        for(int i : list){
            max = Math.max(max, i);
        }
        return max;
    }
}
