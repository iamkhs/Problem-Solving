package leet_code;
// https://leetcode.com/problems/find-the-highest-altitude/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] nums = {-5,1,5,0,-7};
        System.out.println(largestAltitude(nums));
    }

    private static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int j : gain) {
            sum = sum + j;
            max = Integer.max(max, sum);
        }
        return max;
    }
}
