package hacker_rank;
// https://www.hackerrank.com/challenges/find-the-median/problem?isFullScreen=true
import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() / 2);
    }
}
