package leet_code;
// https://leetcode.com/problems/binary-tree-postorder-traversal/description/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> roots = new ArrayList<>();
        inorder(root, roots);
        return roots;
    }

    private static void inorder(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        inorder(root.left, list);
        inorder(root.right, list);
        list.add(root.val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

