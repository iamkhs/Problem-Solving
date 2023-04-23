package leet_code;
// https://leetcode.com/problems/first-letter-to-appear-twice/
import java.util.*;
public class FirstLetterToAppearTwice {
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            if(!set.isEmpty() && set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            else set.add(s.charAt(i));
        }
        return ' ';
    }
}
