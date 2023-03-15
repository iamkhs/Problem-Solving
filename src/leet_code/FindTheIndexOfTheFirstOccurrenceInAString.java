package leet_code;
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String hayStack = "hello";
        String needle = "ll";
        System.out.println(strStr(hayStack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            for (int i = 0; i<haystack.length(); i++){
                if (haystack.charAt(i) == needle.charAt(0)){
                    String s = haystack.substring(i, i + needle.length());
                    if (s.equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
