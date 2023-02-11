package leet_code;
// https://leetcode.com/problems/middle-of-the-linked-list/description/
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            count++;
        }

        int size = count / 2;
        curr = head;
        for(int i = 0; i<size; i++){
            curr = curr.next;
        }

        head = curr;
        return head;
    }
}
