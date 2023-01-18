package leet_code;
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class RemoveDuplicatesFromList {
    public void removeDuplicates(Node head){
        Node tempNode = head;
        while(tempNode != null && tempNode.next != null){
            if (tempNode.data == tempNode.next.data){
                tempNode.next = tempNode.next.next;
            }
            else {
                tempNode = tempNode.next;
            }
        }
    }
}

class Node {
    int data;
    Node next;
    Node() {}
    Node(int data) { this.data = data; }
    Node(int data, Node next) { this.data = data; this.next = next; }
}