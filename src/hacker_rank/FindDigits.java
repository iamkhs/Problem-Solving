package hacker_rank;
// https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true
public class FindDigits {
    public static void main(String[] args) {
        System.out.println(findDigit(124));
    }
    private static int findDigit(int n){
        int num = n;
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            if (rem != 0 && n % rem == 0){
                count++;
            }
        }
        return count;
    }
}