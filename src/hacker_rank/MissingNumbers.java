package hacker_rank;
// https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> brr = new ArrayList<>(List.of(203, 204, 205, 206, 207, 208, 203, 204, 205, 206, 205, 206, 204));
        System.out.println(missingNumbers(arr, brr));
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        for (Integer integer : arr) {
            brr.remove(integer);
        }
        HashSet<Integer> set = new HashSet<>(brr);
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
