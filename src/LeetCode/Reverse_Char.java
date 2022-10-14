package LeetCode;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_Char {
    public static void main(String[] args){

        String[] array = {"a","b"};
        reverseString(array);

    }


    public static void reverseString(String[] s) {

        Collections.reverse(Arrays.asList(s));
        System.out.println(Arrays.toString(s));

    }
}
