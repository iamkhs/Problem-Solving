package leet_code;
// https://leetcode.com/problems/relative-sort-array/description/
import java.util.*;
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : arr2){
            set.add(i);
        }

        List<Integer> list = new ArrayList<>();
        int[] ans = new int[arr1.length];
        int k = 0;
        for(int i : arr2){
            for(int j = 0; j<map.get(i); j++){
                ans[k++] = i;
            }
        }
        for(int i : arr1){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        Collections.sort(list);
        for(int i : list){
            ans[k++] = i;
        }
        return ans;
    }
}
