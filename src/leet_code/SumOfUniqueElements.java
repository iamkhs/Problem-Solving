package leet_code;
// https://leetcode.com/problems/sum-of-unique-elements/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums));
    }

    // Using lambda and stream api
    private static int sumOfUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(nums).forEach(i-> list.add(i));
        return list.stream()
                .filter(i -> Collections.frequency(list,i) == 1)
                .mapToInt(i -> i)
                .sum();

    }

    // brute force
    private static int sumOfUnique2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> uniqueArr = new ArrayList<>();
        for (int i : nums){
            list.add(i);
        }
        int sum = 0;
        for (int i : list) {
            if (Collections.frequency(list, i) == 1) {
                uniqueArr.add(i);
            }
        }

        for (int i : uniqueArr){
            sum+=i;
        }
        return sum;
    }
}
