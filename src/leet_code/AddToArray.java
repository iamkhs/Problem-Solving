package leet_code;
// https://leetcode.com/problems/add-to-array-form-of-integer/description/
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArray {
    public static void main(String[] args){
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(arr, k));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i : num){
            sb.append(i);
        }

        BigInteger bigNum = new BigInteger(String.valueOf(sb));
        bigNum = bigNum.add(BigInteger.valueOf(k));

        String result = bigNum.toString();
        for(int i =0; i<result.length(); i++){
            ans.add(result.charAt(i)-'0');
        }

        return ans;
    }
}
