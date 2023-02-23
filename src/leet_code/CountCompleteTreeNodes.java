package leet_code;
// https://leetcode.com/problems/count-complete-tree-nodes/description/
public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int leftNodes = countNodes(root.left); // left nodes count
        int rightNodes = countNodes(root.right); // right nodes count

        return leftNodes + rightNodes + 1;
    }
}
