package leet_code;
// https://leetcode.com/problems/search-in-a-binary-search-tree/description/
public class SearchInBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.val == val) return root;

        if(val > root.val){
            return searchBST(root.right, val);
        }
        return searchBST(root.left, val);
    }
}
