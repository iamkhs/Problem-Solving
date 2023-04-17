package leet_code;
// https://leetcode.com/problems/find-the-difference/description/
import java.util.*;
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        for(char c : map2.keySet()){
            if(!map.containsKey(c) || map2.get(c) > map.get(c) ){
                return c;
            }
        }
        return ' ';
    }
}
