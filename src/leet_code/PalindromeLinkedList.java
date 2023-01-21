package leet_code;
// https://leetcode.com/problems/palindrome-linked-list/submissions/
public class PalindromeLinkedList {

    // Brute Force with extra Space Complexity!
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode temp = head;

        // counting size
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int[] arr = new int[size];
        int i = 0;

        ListNode list = head;
        while(list != null){
            arr[i++] = list.val;
            list = list.next;
        }

        int first = 0;
        int last = arr.length-1;
        while(first< last){
            if(arr[first] != arr[last]){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
