package leet_code;
// https://leetcode.com/problems/rotate-list/description/
public class RotateList {
    // Brute Force Approach with extra space complexity
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int[] arr = new int[size];
        k = k % arr.length;
        int i = 0;
        temp = head;
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }

        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);

        temp = head;
        i = 0;

        while(temp != null && i < arr.length){
            temp.val = arr[i++];
            temp = temp.next;
        }

        return head;
    }

    private void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Optimized Solution with O(1) Space Complexity
    public ListNode rotateRight2(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }

        k = k % len;
        ListNode currNode = head;
        if(k == 0) return head;
        for(int i  = 0; i<len -k-1; i++){
            currNode = currNode.next;
        }

        ListNode newHead = currNode.next;
        currNode.next = null;
        tail.next = head;

        return newHead;

    }
}
