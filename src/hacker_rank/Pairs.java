package hacker_rank;
// https://www.hackerrank.com/challenges/pairs/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 5, 3, 4, 2));
        System.out.println(pairs(2, list));
    }
    public static int pairs(int k, List<Integer> arr) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(Integer i : arr){
            if(set.contains(i + k)){
                count++;
            }
            if(set.contains(i - k)){
                count++;
            }
            set.add(i);
        }
        return count;
    }
}
