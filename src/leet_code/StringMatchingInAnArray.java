package leet_code;
// https://leetcode.com/problems/string-matching-in-an-array/description/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i<words.length-1; i++){
            for (int j = i+1; j<words.length; j++){
                if (words[i].contains(words[j])){
                    set.add(words[j]);
                }else if(words[j].contains(words[i])){
                    set.add(words[i]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
