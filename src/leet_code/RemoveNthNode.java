package leet_code;
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }

        ListNode first = head;
        ListNode second = head;

        for(int i = 0; i<n-1; i++){
            second = second.next;
        }

        while(second.next != null){
            first = first.next;
            second = second.next;
        }

        // Nth Node is now first node

        if(head == first){
            head = first.next;
        }else{
            ListNode tempNode = head;
            while(tempNode.next != null && tempNode.next != first){
                tempNode = tempNode.next;
            }
            tempNode.next = first.next;
        }
        return head;
    }
}
