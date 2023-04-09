package leet_code;
// https://leetcode.com/problems/perfect-number/description/
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
    private static boolean checkPerfectNumber(int num) {
        if(num < 2){
            return false;
        }
        int sum = 1;
        for(int i = 2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                sum+=i;
                sum+= (num / i);
            }
        }
        return sum == num;
    }
}
