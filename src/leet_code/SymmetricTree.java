package leet_code;
// https://leetcode.com/problems/symmetric-tree/description/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if((left == null || right == null) || left.val != right.val) return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
