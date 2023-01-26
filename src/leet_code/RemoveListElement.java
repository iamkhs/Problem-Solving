package leet_code;
// https://leetcode.com/problems/remove-linked-list-elements/description/
public class RemoveListElement {
    private ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) return null;

        ListNode prev = head;
        ListNode curr = head.next;

        while(curr != null){
            if (curr.val == val){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }
}
