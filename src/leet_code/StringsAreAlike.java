package leet_code;
// https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class StringsAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike2(s));
    }

    // Brute force approach
    private static boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int x = 0;
        int y = 0;
        for (int i = 0; i<mid; i++){
            char a = Character.toLowerCase(s.charAt(i));
            if (a == 'a' || a== 'e' || a=='i' || a=='o' || a=='u') {
                x++;
            }
        }

        for (int i = s.length()-1; i>=mid; i--){
            char a = Character.toLowerCase(s.charAt(i));
            if (a == 'a' || a== 'e' || a=='i' || a=='o' || a=='u') {
                y++;
            }
        }

        return x == y;
    }

    // More optimized with 100% faster solution
    private static boolean halvesAreAlike2(String s) {
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int mid = s.length() / 2;

        int count1 = count(ch,0,mid);
        int count2 = count(ch,mid,s.length());
        return count1 == count2;
    }

    private static int count(char[] ch, int start, int end){
        int count = 0;
        for (int i = start; i<end; i++){
            if (ch[i] == 'a' || ch[i]== 'e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
                count++;
            }
        }
        return count;
    }
}
