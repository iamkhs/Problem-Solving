package leet_code;
// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/
import java.util.ArrayList;
import java.util.HashMap;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else map.put(s.charAt(i), 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        for(int i = 0; i<list.size()-1; i++){
            if(!list.get(i).equals(list.get(i + 1))){
                return false;
            }
        }
        return true;
    }
}
