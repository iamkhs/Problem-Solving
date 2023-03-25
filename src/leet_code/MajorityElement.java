package leet_code;
// https://leetcode.com/problems/majority-element/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement2(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Using HashMap
    public static int majorityElement2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else map.put(num, 1);
        }

        int n = nums.length;
        for (int i :  map.keySet()){
            if (map.get(i) > n / 2){
                return i;
            }
        }
        return -1;
    }
}
