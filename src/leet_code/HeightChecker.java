package leet_code;

import java.util.Arrays;
// https://leetcode.com/problems/height-checker/
public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }
    private static int heightChecker(int[] heights) {
        int [] arr = heights.clone();
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if (heights[i] != arr[i]) count++;
        }
        return count;
    }
}
