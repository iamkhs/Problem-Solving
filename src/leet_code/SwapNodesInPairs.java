package leet_code;
// https://leetcode.com/problems/swap-nodes-in-pairs/description/
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode prevNode = head;
        ListNode nextNode = head.next;

        while(prevNode != null && nextNode != null){
            // swapping
            int temp = nextNode.val;
            nextNode.val = prevNode.val;
            prevNode.val = temp;

            if(nextNode.next != null){
                nextNode = nextNode.next.next;
            }
            prevNode = prevNode.next.next;
        }
        return head;
    }
}
