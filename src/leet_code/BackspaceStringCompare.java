package leet_code;
// https://leetcode.com/problems/backspace-string-compare/description/
public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }
    public static boolean backspaceCompare(String s, String t) {
        String s1 = delete(s);
        String s2 = delete(t);
        return s1.contentEquals(s2);
    }

    private static String delete(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) =='#' && sb.length() > 0){
                sb.deleteCharAt(sb.length()-1);
            }else {
                sb.append(s.charAt(i));
            }
        }
        if (!sb.isEmpty() && sb.charAt(0) == '#'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
