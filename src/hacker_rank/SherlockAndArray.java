package hacker_rank;
// https://www.hackerrank.com/challenges/sherlock-and-array/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;

public class SherlockAndArray {
    public static void main(String[] args) {
        System.out.println(balancedSums(new ArrayList<>(List.of(1, 1, 4, 1, 1))));
    }
    public static String balancedSums(List<Integer> arr) {
        int leftSum = 0;
        int rightSum = 0;
        for(Integer i : arr){
            rightSum+=i;
        }

        for(Integer i : arr){
            rightSum-=i;
            if(rightSum == leftSum){
                return "YES";
            }
            leftSum+=i;
        }
        return "NO";
    }
}
