package leet_code;
// https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/
public class RemoveMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;

        if (head == null || head.next == null){
            return null;
        }
        ListNode tempNode = head;
        while(tempNode != null){
            tempNode = tempNode.next;
            count++;
        }
        count  = count / 2;

        ListNode first = head;
        for (int i = 0; i<count; i++){
            first = first.next;
        }

        ListNode temp = head;
        while(temp.next != null &&temp.next != first){
            temp = temp.next;
        }
        temp.next = first.next;
        return head;
    }
}
