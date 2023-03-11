package leet_code;
// https://leetcode.com/problems/insert-into-a-binary-search-tree/description/
public class InsertIntoBinarySearchTree {

    // Iterative Solution with O(1) space complexity and Time Complexity O(logN)
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root == null) return newNode;

        TreeNode curr = root;
        TreeNode parent = null;

        while(curr != null){
            parent = curr;
            if(val > curr.val){
                curr = curr.right;
            }
            else curr = curr.left;
        }

        if(val > parent.val){
            parent.right = newNode;
        }
        else parent.left = newNode;

        return root;
    }

    // Recursive Solution with O(h) space complexity, h stand for height of the tree and Time Complexity O(logN)
    public TreeNode recursiveInsertIntoBST(TreeNode root, int val){
        if(root == null){
            root = new TreeNode(val);
        }

        if(val > root.val) {
            root.right = recursiveInsertIntoBST(root.right, val);
        }

        else if(val < root.val) {
            root.left = recursiveInsertIntoBST(root.left, val);
        }

        return root;
    }
}
