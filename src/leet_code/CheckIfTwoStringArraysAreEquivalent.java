package leet_code;
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a", "b","c"};
        String[] word2 = {"a", "c", "d"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for(String s : word1){
            sb.append(s);
        }

        StringBuilder sb2 = new StringBuilder();
        for(String s : word2){
            sb2.append(s);
        }
        return sb.toString().equals(sb2.toString());
    }
}
