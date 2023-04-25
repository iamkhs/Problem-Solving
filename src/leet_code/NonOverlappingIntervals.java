package leet_code;
// https://leetcode.com/problems/non-overlapping-intervals/
import java.util.*;
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o-> o[1]));
        int ans = 0;
        int lastEnd = intervals[0][1];

        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] >= lastEnd){
                lastEnd = intervals[i][1];
            }
            else ans++;
        }

        return ans;
    }
}
