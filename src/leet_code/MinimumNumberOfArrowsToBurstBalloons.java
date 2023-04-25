package leet_code;
// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/
import java.util.*;
public class MinimumNumberOfArrowsToBurstBalloons {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingDouble(o-> o[1]));
        int ans = 1;
        int lastEnd = points[0][1];

        for(int i =1; i<points.length; i++){
            if(points[i][0] > lastEnd){
                ans++;
                lastEnd = points[i][1];
            }
        }

        return ans;
    }
}
