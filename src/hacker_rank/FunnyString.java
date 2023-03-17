package hacker_rank;
// https://www.hackerrank.com/challenges/funny-string/problem?isFullScreen=true
public class FunnyString {
    public static void main(String[] args) {
        System.out.println(funnyString("bcxz"));
    }
    public static String funnyString(String s) {
        for(int i = 1; i<s.length(); i++){
            int a = Math.abs(s.charAt(i) - s.charAt(i-1));
            int b = Math.abs(s.charAt(s.length()-i-1)-s.charAt(s.length()-i));
            if(a != b){
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
