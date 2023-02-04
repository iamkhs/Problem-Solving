package hacker_rank;
// https://www.hackerrank.com/challenges/recursive-digit-sum/problem?isFullScreen=true
public class RecursiveDigitSum {
    public static void main(String[] args){
        System.out.println(superDigit("123",3));
    }

    public static int superDigit(String n, int k) {
        long sum = 0;
        for(int i = 0; i<n.length(); i++){
            sum+= n.charAt(i)-'0';
        }
        sum*=k;
        return (int)superDigit(sum);
    }

    private static long superDigit(long n){
        if(n < 10){
            return n;
        }
        int sum = 0;
        while(n > 0){
            sum+= n % 10;
            n = n / 10;
        }
        return superDigit(sum);
    }
}
