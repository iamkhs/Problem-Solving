package leet_code;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfStepsForZero {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }
    // 100% faster with 0ms
    private static int numberOfSteps(int num) {
        int count = 0;
        int temp = num;
        while (temp != 0){
            if (num % 2==0){
                num = num / 2;
            }
            else num = temp-1;
            temp = num;
            count++;
        }
        return count;
    }
}
