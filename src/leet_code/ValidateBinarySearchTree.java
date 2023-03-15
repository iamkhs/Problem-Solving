package leet_code;
// https://leetcode.com/problems/validate-binary-search-tree/description/
public class ValidateBinarySearchTree {
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        boolean left = isValidBST(root.left);

        if(prev != null && prev.val >= root.val) return false;

        prev = root;

        boolean right = isValidBST(root.right);

        return left && right;
    }
}
