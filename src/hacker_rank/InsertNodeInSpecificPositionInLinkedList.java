package hacker_rank;
// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem?isFullScreen=true
class SinglyLinkedListNode{
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int data) {
        this.data = data;
    }
}
public class InsertNodeInSpecificPositionInLinkedList {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        int count = 0;
        SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        while(count < position-1){
            curr = curr.next;
            count++;
        }

        var temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
        return llist;
    }
}
