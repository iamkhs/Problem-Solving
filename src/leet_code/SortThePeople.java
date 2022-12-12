package leet_code;

import java.util.Arrays;
// https://leetcode.com/problems/sort-the-people/description/
public class SortThePeople {
    public static void main(String[] args) {
        int[] heights = {155,185,150};
        String[] names = {"Alice","Bob","Bob"};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }

    // Using Selection sort Algorithm
    private static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i< heights.length-1; i++){
            int min = i;
            for (int j = i+1; j< heights.length; j++){
                if (heights[j] > heights[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = heights[min];
                heights[min] = heights[i];
                heights[i] = temp;

                String temp2 = names[min];
                names[min] = names[i];
                names[i] = temp2;
            }
        }
        return names;
    }
}
