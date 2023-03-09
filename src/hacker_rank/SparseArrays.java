package hacker_rank;
// https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        for (String temp : queries) {
            for (String s : stringList) {
                if (s.equals(temp)) {
                    count++;
                }
            }
            ans.add(count);
            count = 0;
        }
        return ans;
    }
}
