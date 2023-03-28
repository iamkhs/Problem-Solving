package leet_code;
// https://leetcode.com/problems/kth-distinct-string-in-an-array/description/
import java.util.*;

public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s : arr){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }else{
                map.put(s, 1);
            }
        }

        List<String> list = new ArrayList<>();
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        if(k > list.size()){
            return "";
        }

        return list.get(k-1);
    }
}
