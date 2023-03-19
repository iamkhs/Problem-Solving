package leet_code;
// https://leetcode.com/problems/unique-number-of-occurrences/description/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            int count = 1;
            if (map.containsKey(j)) {
                count = map.get(j) + 1;
            }
            map.put(j, count);
        }

        List<Integer> list = new ArrayList<>(map.values());
        for (int i = 0; i<list.size()-1; i++){
            for (int j = i+1; j<list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    return false;
                }
            }
        }
        return true;
    }
}
