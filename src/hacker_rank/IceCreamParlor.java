package hacker_rank;
// https://www.hackerrank.com/challenges/icecream-parlor/problem?isFullScreen=true
import java.util.ArrayList;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(8,2,3,4,5,6,7));
        System.out.println(iceCreamParlor(7, list));
    }

    // Time Complexity O(n)
    public static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        int i = 0;
        int j = 1;

        List<Integer> ans = new ArrayList<>();
        int size = arr.size();
        while(j < size){
            if (arr.get(i) < m && arr.get(j) < m){
                if (arr.get(i) + arr.get(j) == m){
                    ans.add(i+1);
                    ans.add(j+1);
                    break;
                }
            }
            if (j+1 == size){
                i++;
                j = i+1;
            }
            else j++;
        }
        return ans;
    }
}
