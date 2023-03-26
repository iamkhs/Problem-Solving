package leet_code;
//https://leetcode.com/problems/majority-element-ii/description/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else map.put(i, 1);
        }

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i : map.keySet()){
            if(map.get(i) > n/3){
                ans.add(i);
            }
        }
        return ans;
    }
}
