package leet_code;
// https://leetcode.com/problems/reverse-words-in-a-string/description/
public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    // Time complexity = O(n) Space complexity O(n)
    private static String reverseWords(String s) {
        String[]str = s.trim().split(" ");
        int i = 0;
        int j = str.length-1;

        while(i < j){
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

        StringBuilder ans = new StringBuilder();
        for (String value : str) {
            if (!value.equals("")) {
                ans.append(value).append(" ");
            }
        }
        return ans.toString().trim();
    }
}
