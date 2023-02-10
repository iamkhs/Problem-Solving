package leet_code;
// https://leetcode.com/problems/removing-stars-from-a-string/description/
import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
        System.out.println(removeStars2(s));
    }

    // Using Stack Solution
    private static String removeStars(String s) {
         Stack<String> stack = new Stack<>();
         for (int i = 0; i<s.length(); i++){
             if (s.charAt(i) == '*'){
                 stack.pop();
             }
             else stack.push(String.valueOf(s.charAt(i)));
         }

         StringBuilder sb = new StringBuilder();
         for (String str : stack){
             sb.append(str);
         }
        return sb.toString();
    }

    // Optimized Solution
    private static String removeStars2(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '*' && sb.length() >=0 ){
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
