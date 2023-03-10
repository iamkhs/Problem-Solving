package leet_code;
// https://leetcode.com/problems/check-completeness-of-a-binary-tree/description/
import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfBinaryTree {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = false;

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                flag = true;
            }
            else{
                if(flag) return false;
                q.offer(curr.left);
                q.offer(curr.right);
            }
        }

        return true;
    }
}
