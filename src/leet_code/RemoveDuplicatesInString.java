package leet_code;
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
import java.util.Stack;

public class RemoveDuplicatesInString {
    public static void main(String[] args){
        String s = "abbaca";
        System.out.println(removeDuplicates2(s));
    }

    private static String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            String ch = String.valueOf(s.charAt(i));
            if (!stack.isEmpty() && stack.peek().equals(ch)){
                stack.pop();
            }
            else stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (String st: stack){
            sb.append(st);
        }
        return sb.toString();
    }


    // More Optimized
    private static String removeDuplicates2(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int len = sb.length();
            if (sb.length() == 0 ||sb.charAt(len-1) != ch){
                sb.append(ch);
            }
            else sb.deleteCharAt(len-1);
        }

        return sb.toString();
    }
}
