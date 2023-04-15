package leet_code;
// https://leetcode.com/problems/custom-sort-string/description/
import java.util.*;
public class CustomSortString {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c : order.toCharArray()){
            if(map.containsKey(c)){
                for(int i = 0; i<map.get(c); i++){
                    sb.append(c);
                }
                map.remove(c);
            }
        }
        for(char c : map.keySet()){
            for(int i = 0; i<map.get(c); i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
