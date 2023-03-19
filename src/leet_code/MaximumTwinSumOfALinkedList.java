package leet_code;
// https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {
    public int pairSum(ListNode head) {
        if(head == null) return 0;
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        int max = 0;
        int i = 0;
        int j = list.size()-1;
        while(i<j){
            int tempMax = list.get(i) + list.get(j);
            max = Math.max(tempMax, max);
            i++;
            j--;
        }

        return max;
    }
}
