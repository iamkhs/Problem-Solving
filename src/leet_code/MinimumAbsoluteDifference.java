package leet_code;
import java.util.*;
// https://leetcode.com/problems/minimum-absolute-difference/
public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){
            int diff = Math.abs(arr[i] - arr[i+1]);
            if (diff < minDiff){
                minDiff = diff;
                ans.clear();
            }
            if(diff == minDiff){
                ans.add(List.of(arr[i], arr[i + 1]));
            }
        }
        return ans;
    }
}
