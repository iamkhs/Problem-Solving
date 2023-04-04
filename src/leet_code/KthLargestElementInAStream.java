package leet_code;
// https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    PriorityQueue<Integer> q = new PriorityQueue<>();
    int gk;
    public KthLargestElementInAStream(int k, int[] nums) {
        gk = k;
        for(int i : nums){
            q.add(i);
            if(q.size() > k){
                q.poll();
            }
        }
    }
    public int add(int val) {
        q.add(val);
        if(q.size() > gk){
            q.poll();
        }

        return q.peek();
    }
}
