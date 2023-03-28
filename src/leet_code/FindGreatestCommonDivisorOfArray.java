package leet_code;
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/description/
public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int[] arr = {7,5,6,8,3};
        var result  = findGCD(arr);
        System.out.println(result);
    }
    public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = -1;

        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        for (int i = min; i > 0; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
