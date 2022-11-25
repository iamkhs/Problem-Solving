package leet_code;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithCandies {
    public static void main(String[] args) {
        int [] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        for (int i : candies){
            if (extraCandies + i >= max){
                arrayList.add(true);
            }
            else{
                arrayList.add(false);
            }
        }
        return arrayList;
    }
}
