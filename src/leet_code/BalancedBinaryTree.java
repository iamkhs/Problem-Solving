package leet_code;
// https://leetcode.com/problems/balanced-binary-tree/description/
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);
        if(Math.abs(left - right) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int heightOfTree(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }
}
