package leet_code;
// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/
import java.util.*;
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int count = 0;
        for(Character c : t.toCharArray()){
            if(map.containsKey(c) && map.get(c) != 0){
                map.put(c, map.get(c)-1);
            }
            else{
                count++;
            }
        }
        return count;
    }
}
