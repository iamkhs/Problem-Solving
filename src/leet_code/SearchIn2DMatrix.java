package leet_code;
// https://leetcode.com/problems/search-a-2d-matrix/submissions/
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,3}};
        int target = 3;
        System.out.println(search(nums,target));
    }

    // more efficient, 100% faster with 0ms
    private static boolean search(int[][] matrix, int target){
        int r = 0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                c--;
            }
            else r++;
        }
        return false;
    }

    // Linear Search with O(n^2) time complexity
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
