package leet_code;
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args){
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }
    private static String firstPalindrome(String[] words) {
        for (String s: words){
            if (isPalindrome(s)){
                return s;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
