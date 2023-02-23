package leet_code;
// https://leetcode.com/problems/binary-tree-preorder-traversal/description/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> roots = new ArrayList<>();
        inorder(root, roots);
        return roots;
    }

    private static void inorder(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.val);
        inorder(root.left, list);
        inorder(root.right, list);
    }
}
