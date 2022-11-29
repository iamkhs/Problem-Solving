package leet_code;

import java.util.Arrays;
// https://leetcode.com/problems/plus-one/
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    private static int[] plusOne(int[] digits){
        int length = digits.length-1;
        for (int i = length; i>=0; i--){
            if (digits[i] < 9){
                digits[i] = digits[i]+1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] arr = new int[digits.length+1];
        arr[0] = 1;
        return arr;
    }
}
