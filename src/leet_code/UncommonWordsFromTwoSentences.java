package leet_code;
// https://leetcode.com/problems/uncommon-words-from-two-sentences/description/
import java.util.*;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String s : str1){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else map.put(s, 1);
        }

        for(String s : str2){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else map.put(s, 1);
        }

        List<String> list = new ArrayList<>();
        for (String s : map.keySet()){
            if (map.get(s) == 1){
                list.add(s);
            }
        }

        String[] ans = new String[list.size()];
        list.toArray(ans);
        return ans;
    }
}
