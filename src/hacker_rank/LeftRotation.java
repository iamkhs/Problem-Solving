package hacker_rank;
// https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Collections.rotate(arr, -d); // Using inbuilt method, using -k instead of k means that
        // the rotate() method will rotate the elements in the list to the left by k positions
        // return arr;


        int n = arr.size();
        d = d % n;
        List<Integer> rotated = new ArrayList<>();
        for(int i = 0; i<n; i++){
            rotated.add(arr.get((i+d) % n));
        }
        return rotated;
    }
}
