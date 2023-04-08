package leet_code;
// https://leetcode.com/problems/reverse-only-letters/
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public static String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char[] ch = s.toCharArray();
        while(i < j){
            if (Character.isLetter(ch[i])){
                if (Character.isLetter(ch[j])) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                    i++;
                }
                j--;
            } else {
                i++;
            }
        }
        return new String(ch);
    }
}
