package leet_code;
// https://leetcode.com/problems/invert-binary-tree/description/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        // Swap the left and right child of the current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtree
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
