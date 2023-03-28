package leet_code;
// https://leetcode.com/problems/trim-a-binary-search-tree/description/
public class TrimABinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        if(root.val >= low && root.val <= high){
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
        }
        if(root.val > high){
            return trimBST(root.left, low, high);
        }
        if(root.val < low){
            return trimBST(root.right, low, high);
        }

        return root;
    }
}