package leet_code;
// https://leetcode.com/problems/add-two-numbers/description/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry = 0;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            int value = sum % 10;
            ans.next = new ListNode(value);
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + carry;
            carry = sum / 10;
            int value = sum % 10;
            ans.next = new ListNode(value);
            ans = ans.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + carry;
            carry = sum / 10;
            int value = sum % 10;
            ans.next = new ListNode(value);
            ans = ans.next;
            l2 = l2.next;
        }

        if(carry>0){
            ans.next = new ListNode(carry);
        }

        return curr.next;
    }
}
