package leet_code;
// https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeTwoSortedLists {
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // After the while loop if any of list1 nodes are remaining then add it
        if(list1 != null){
            curr.next = list1;
        }

        // also add it for list2
        if(list2 != null){
            curr.next = list2;
        }

        // after the end the linkedList will look like this
        // 0->1->1->2->3->4->4 but the first node which we create 0, we don't need to return this,
        // so we return the first.next node
        return ans.next;
    }
}
