package leet_code;
// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/
import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        return construct(list, 0, list.size()-1);
    }

    public TreeNode construct(List<Integer> list, int start, int end){
        if(start > end){
            return null;
        }

        int mid = start+(end - start)/ 2;
        TreeNode node = new TreeNode(list.get(mid));
        node.left = construct(list, start, mid-1);
        node.right = construct(list, mid+1, end);
        return node;
    }
}
