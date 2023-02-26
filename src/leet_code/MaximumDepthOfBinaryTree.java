package leet_code;
// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftNodes = maxDepth(root.left);
        int rightNodes = maxDepth(root.right);

        return Math.max(leftNodes, rightNodes)+1;
    }
}
