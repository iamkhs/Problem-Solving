package leet_code;
// https://leetcode.com/problems/count-the-digits-that-divide-a-number/description/
public class CountDigitDivideByNum {
    public static void main(String[] args) {
        int num = 1248;
        System.out.println(countDigits(num));
    }
    private static int countDigits(int num) {
        int count = 0;
        int temp = num;
        while(num > 0){
            int val = num % 10;
            if(val != 0 && temp % val == 0){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}
