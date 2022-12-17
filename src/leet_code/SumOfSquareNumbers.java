package leet_code;
// https://leetcode.com/problems/sum-of-square-numbers/description/
public class SumOfSquareNumbers {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(4));
    }

    public static boolean judgeSquareSum(int c) {
        for (int i = 0; i <= Math.sqrt(c); i++) {
            int a = c - i * i;  // calculate a
            int sqrtA = (int) Math.sqrt(a);  // calculate the square root of a
            if (sqrtA * sqrtA == a) {  // check if a is a perfect square
                return true;  // a and i satisfy the condition, so return true
            }
        }
        return false;
    }
}
