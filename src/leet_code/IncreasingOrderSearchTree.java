package leet_code;
// https://leetcode.com/problems/increasing-order-search-tree/description/
import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        toList(root);
        root = null;
        return buildTree(root, 0);
    }
    private TreeNode buildTree(TreeNode root, int index){
        if(index >= list.size()){
            return root;
        }

        if(root == null){
            root = new TreeNode(list.get(index++));
        }

        root.left = null;
        root.right = buildTree(root.right, index);

        return root;
    }
    private void toList(TreeNode root){
        if(root == null) return;
        toList(root.left);
        list.add(root.val);
        toList(root.right);
    }
}
