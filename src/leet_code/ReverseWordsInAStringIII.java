package leet_code;
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        StringBuilder newString = new StringBuilder();
        for (String i : s.split(" ")){
            newString.append(rev(i)).append(" ");
        }
        return newString.deleteCharAt(newString.length()-1).toString();
    }

    private static String rev(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
