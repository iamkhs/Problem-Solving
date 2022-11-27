package leet_code;
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegative {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }

    // Linear Search with O(n^2) time complexity
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i<grid.length; i++){
            for (int j = 0; j<grid[i].length; j++){
                if (grid[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}
