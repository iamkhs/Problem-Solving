package hacker_rank;
// https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> ar = new ArrayList<>();
        for (int i = 0; i<6; i++){
            ar.add(input.nextInt());
        }
        System.out.println(divisibleSumPairs(6,3,ar));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count  = 0;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<ar.size(); j++){
                if ((ar.get(i) + ar.get(j)) % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
