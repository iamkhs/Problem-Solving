package leet_code;
// https://leetcode.com/problems/valid-parentheses/description/
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        return isBalanced(s);
    }

    public static boolean isBalanced(String input){
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()){
            if (c == '[' || c == '(' || c == '{'){
                deque.push(c);
            }
            else if(c == ']'){
                if (deque.isEmpty() || deque.pop() != '['){
                    return false;
                }
            }
            else if (c == ')'){
                if (deque.isEmpty() || deque.pop() != '('){
                    return false;
                }
            }
            else if(c == '}'){
                if (deque.isEmpty() || deque.pop() != '{'){
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
