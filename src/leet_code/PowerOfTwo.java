package leet_code;
// https://leetcode.com/problems/power-of-two/description/
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    private static boolean isPowerOfTwo(int x) {
        return (x > 0) && ((x & (x - 1)) == 0);
    }
}
