package leet_code;
// https://leetcode.com/problems/top-k-frequent-elements/description/
import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        // Create an array to store the result
        int[] ans = new int[k];
        // Create a priority queue (min-heap) based on the lower frequency of elements
        Queue<Integer> q = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int i : map.keySet()) {
            q.add(i);
            // If the size of the priority queue is greater than k,
            // remove the top element (which has the lowest frequency)
            if (q.size() > k) {
                q.poll();
            }
        }

        int j = 0;
        for(int i : q){
            ans[j++] = i;
        }

        return ans;
    }
}
