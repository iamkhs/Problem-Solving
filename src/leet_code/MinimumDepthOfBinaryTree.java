package leet_code;
// https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null)return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lvl = 1;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i<size; i++){
                TreeNode curr = q.remove();
                if(curr.left == null && curr.right == null){
                    return lvl;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            lvl++;
        }
        return lvl;
    }
}
