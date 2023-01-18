package leet_code;
// https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
        return head;
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {this.val = val; this.next = next; }
}
