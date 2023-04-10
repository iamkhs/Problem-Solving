package leet_code;
// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/
import java.util.*;
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        Queue<Integer> q = new PriorityQueue<>();
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                q.add(matrix[i][j]);
            }
        }
        int ans = 0;
        for(int i = 0; i<k; i++){
            ans = q.poll();
        }
        return ans;
    }
}
