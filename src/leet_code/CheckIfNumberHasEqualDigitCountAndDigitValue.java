package leet_code;
// https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
import java.util.*;
public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
    }
    public static boolean digitCount(String num) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i<num.length(); i++){
            int n = Character.getNumericValue(num.charAt(i));
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for (int i = 0; i<num.length(); i++){
            int c = Character.getNumericValue(num.charAt(i));
            if (map.containsKey(i)) {
                int val = map.get(i);
                if (val != c) return false;
            }else if (c > 0){
                return false;
            }
        }
        return true;
    }
}
