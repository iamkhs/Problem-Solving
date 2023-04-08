package leet_code;
// https://leetcode.com/problems/remove-nodes-from-linked-list/description/
public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        ListNode curr = reverse(head);
        ListNode result = new ListNode(0);
        ListNode p = result;
        int max = 0;
        while(curr != null){
            if(curr.val >= max){
                p.next = new ListNode(curr.val);
                p = p.next;
                max = curr.val;
            }
            curr = curr.next;
        }
        // [8,3,13,2,5]
        return reverse(result.next);
    }

    private ListNode reverse(ListNode head){
        ListNode curr = head.next;
        ListNode prev = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head.next = null;
        head = prev;

        return head;
    }
}
