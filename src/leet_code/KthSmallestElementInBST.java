package leet_code;
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBST {
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        inOrder(root);
        return list.get(k-1);
    }

    private void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
