package hacker_rank;
// https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int size = arr.size();

        for(int i = 0; i<size; i++){
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(size - i - 1);
        }

        return Math.abs(leftDiagonal - rightDiagonal);
    }
}
