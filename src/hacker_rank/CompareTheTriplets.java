package hacker_rank;
// https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;

        for(int i = 0; i<a.size(); i++){
            if(a.get(i) > b.get(i)){
                alice++;
            }
            else if(a.get(i)< b.get(i)){
                bob++;
            }
        }

        return Arrays.asList(alice,bob);
    }
}
