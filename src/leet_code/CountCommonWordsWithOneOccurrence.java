package leet_code;
import java.util.*;

// https://leetcode.com/problems/count-common-words-with-one-occurrence/description/
public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        String[] words1 = {"leetcode", "is", "amazing", "as", "is"}, words2 = {"amazing", "leetcode", "is"};
        System.out.println(countWords(words1, words2));
    }
    private static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        for(String s : words1){
            map1.put(s, map1.getOrDefault(s, 0)+1);
        }

        Map<String, Integer> map2 = new HashMap<>();
        for(String s : words2){
            map2.put(s, map2.getOrDefault(s, 0)+1);
        }

        int count = 0;
        for(String s : map1.keySet()){
            if(map1.get(s).equals(map2.get(s))){
                if(map1.get(s) == 1 && map2.get(s) ==1){
                    count++;
                }
            }
        }
        return count;
    }
}
