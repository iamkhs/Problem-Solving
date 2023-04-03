package leet_code;
// https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllLonelyNumbersInTheArray {
    public static void main(String[] args) {
        int[] arr = {10,6,5,8};
        System.out.println(findLonely(arr));
    }

    public static List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        List<Integer> lonelyNumbers = new ArrayList<>();

        // Count the occurrences of each number in nums
        for (int i : nums){
            numCount.put(i, numCount.getOrDefault(i, 0)+1);
        }

        // Add lonely numbers to the result
        for (int i : nums){
            if (!numCount.containsKey(i-1) && !numCount.containsKey(i+1) && numCount.get(i)==1){
                lonelyNumbers.add(i);
            }
        }
        return lonelyNumbers;
    }
}
