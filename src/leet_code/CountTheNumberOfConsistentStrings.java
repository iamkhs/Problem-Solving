package leet_code;
// https://leetcode.com/problems/count-the-number-of-consistent-strings/
import java.util.*;
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i<allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for(String s : words){
            char[] ch = s.toCharArray();
            boolean flag = false;
            for (char c : ch) {
                if (!set.contains(c)) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                count++;
            }
        }
        return count;
    }
}
