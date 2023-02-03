package leet_code;
// https://leetcode.com/problems/merge-k-sorted-lists/description/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
     I solved this problem with this little technique,
     The wise solution for solving this problem is using Merge Sort
     But today 03-02-2022 till this day I don't know marge sort and priority queue Data Structure
     in future in sha alla I will solve this with merge sort algorithm
 */

public class MargeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for(ListNode list : lists){
            while(list != null){
                arr.add(list.val);
                list = list.next;
            }
        }

        Collections.sort(arr);

        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        for(int i : arr){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return ans.next;
    }
}
