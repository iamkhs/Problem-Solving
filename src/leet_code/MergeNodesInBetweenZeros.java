package leet_code;
// https://leetcode.com/problems/merge-nodes-in-between-zeros/description/
public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next;
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        int sum = 0;
        while(curr != null){
            if(curr.val != 0){
                sum+=curr.val;
            }else{
                p.next = new ListNode(sum);
                p = p.next;
                sum = 0;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
