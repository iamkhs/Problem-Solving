package leet_code;
// https://leetcode.com/problems/linked-list-cycle/description/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode fast = head; // fast moves 2x than slow
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next; // fast moves 2x than slow
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
