package leet_code;
// https://leetcode.com/problems/length-of-last-word/description/
public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";

        System.out.println(lengthOfLastWord2(s));
    }

    private static int lengthOfLastWord(String s) {
        String[]str = s.trim().split(" ");
        String count = str[str.length-1];
        return count.length();
    }

    // Another Approach more efficient
    private static int lengthOfLastWord2(String s) {
        s = s.trim();
        int lastSpace = s.lastIndexOf(" ");
        return s.length() - (lastSpace + 1);
    }

}
