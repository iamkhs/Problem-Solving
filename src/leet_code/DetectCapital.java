package leet_code;
// https://leetcode.com/problems/detect-capital/description/
public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }

    private static boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) return true;
        else if (word.equals(word.toLowerCase())) return true;
        else {
            String newString = word.substring(1);
            return newString.equals(newString.toLowerCase());
        }
    }
}
