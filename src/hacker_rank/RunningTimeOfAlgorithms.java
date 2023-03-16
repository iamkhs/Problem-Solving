package hacker_rank;
// https://www.hackerrank.com/challenges/runningtime/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;

public class RunningTimeOfAlgorithms {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(2, 1, 3, 1, 2));
        System.out.println(runningTime(list));
    }

    private static int runningTime(List<Integer> arr) {
        int count = 0;
        for (int i = 0; i<arr.size()-1; i++){
            for (int j = i+1; j>0; j--){
                if (arr.get(j) < arr.get(j-1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j-1));
                    arr.set(j-1, temp);
                    count++;
                }
                else break;
            }
        }
        return count;
    }
}
