package leet_code;
// https://leetcode.com/problems/sort-list/description/
import java.util.Arrays;

public class SortList {

    /*
    I'm sorry to say that I can't solve this problem with  O(n logN) time complexity,
    cz I don't know merge sort / quick sort algorithm and
    without those algorithm it couldn't solve O(n logN) time complexity, and
    that's why I used simple technique with extra space
     */

    private ListNode sortList(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        int[] arr = new int[size];
        int index = 0;

        temp = head;
        while(temp != null){
            arr[index++] = temp.val;
            temp = temp.next;
        }

        Arrays.sort(arr);

        index = 0;
        ListNode newNode = head;
        while (index< size){
            newNode.val = arr[index];
            newNode = newNode.next;
            index++;
        }

        return head;
    }
}
