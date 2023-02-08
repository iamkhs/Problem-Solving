package leet_code;
// https://leetcode.com/problems/merge-strings-alternately/description/
public class MergeStringsAlternately {
    public static void main(String[] args){
        String word1 = "ab";
        String word2 = "pqrs";

        String ans = merge(word1, word2);
        System.out.println(ans);
    }

    // Brute Force Approach
    private static String merge(String s1, String s2){
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i < s1.length() && j < s2.length()){
            sb.append(s1.charAt(i++));
            sb.append(s2.charAt(j++));
        }

        while(i < s1.length()){
            sb.append(s1.charAt(i++));
        }

        while(j < s2.length()){
            sb.append(s2.charAt(j++));
        }

        return sb.toString();
    }


    // Alternative Simpler Short Code
    private static String mergeAlternately(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while(i < s1.length() && j < s2.length()){
            sb.append(s1.charAt(i++)).append(s2.charAt(j++));
        }
        return sb.append(s1.substring(i)).append(s2.substring(j)).toString();
    }
}
