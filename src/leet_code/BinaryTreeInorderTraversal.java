package leet_code;
// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private static void inorder(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
