package leet_code;
//https://leetcode.com/problems/find-the-pivot-integer/description/
public class FindThePivotInteger {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
    public static int pivotInteger(int n) {
        int rightSum = sum(n);
        int leftSum = 0;
        for(int i =n; i>=0; i--){
            leftSum+=i;
            if(leftSum == rightSum){
                return i;
            }
            rightSum-=i;
        }
        return -1;
    }

    private static int sum(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            sum+=i;
        }
        return sum;
    }
}
