package leet_code;
// https://leetcode.com/problems/binary-tree-level-order-traversal/description/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> levels = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                levels.add(level);
                level = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                level.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }

        }
        return levels;
    }
}
