package leet_code;
// https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 1; // reset count for each new element
            if (map.containsKey(num)) {
                count = map.get(num);
                count = count + 1;
            }
            map.put(num, count); // update count in the map
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a, b)->{
            if(map.get(a).equals(map.get(b))){
                return b -a;
            }
            else return map.get(a) - map.get(b);
        });

        int[] result = new int[nums.length];
        int k = 0;
        for(int num : list){
            for(int i = 0; i<map.get(num); i++){
                result[k++] = num;
            }
        }

        return result;
    }
}
