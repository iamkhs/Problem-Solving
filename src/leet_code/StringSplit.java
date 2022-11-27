package leet_code;
//https://leetcode.com/problems/split-a-string-in-balanced-strings/
public class StringSplit {
    public static void main(String[] args) {
        String s  = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    private static int balancedStringSplit(String s) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == 'R'){
                sum++;
            }else{
                sum--;
            }
            if (sum == 0){
                ans ++;
            }
        }
        return ans;
    }
}
