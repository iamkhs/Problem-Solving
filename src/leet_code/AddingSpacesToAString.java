package leet_code;
// https://leetcode.com/problems/adding-spaces-to-a-string/
public class AddingSpacesToAString {
    public static void main(String[] args) {
        System.out.println(addSpaces("spacing", new int[]{0,1,2,3,4,5,6}));
    }
    private static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        int index = 0;
        int count = 0;
        for(int i = 0; i<ch.length; i++){
            if (index < spaces.length) {
                count = spaces[index];
            }
            if(count == i){
                sb.append(" ");
                index++;
            }
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}
