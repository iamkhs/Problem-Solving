package leet_code;
// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
public class SearchIn2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;

        System.out.println(searchMatrix(matrix, target));
    }
    private static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col>=0){
            if(matrix[row][col] == target){
                return true;
            }

            if(matrix[row][col] > target){
                col--;
            }

            else row++;
        }
        return false;
    }
}
