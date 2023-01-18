package leet_code;
// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/
public class BinaryToIntegerLL {

    // Brute Force Approach
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;

        while(temp != null){
            sb.append(temp.val);
            temp = temp.next;
        }

        return Integer.parseInt(String.valueOf(sb),2);
    }
}
