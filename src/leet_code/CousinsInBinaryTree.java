package leet_code;
// https://leetcode.com/problems/cousins-in-binary-tree/description/
import java.util.LinkedList;
import java.util.Queue;

public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int a, int b) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            boolean isAexist = false;
            boolean isBexist = false;
            for(int i = 0; i<n; i++){
                TreeNode curr = q.remove();
                if(curr.val == a) isAexist = true;
                if(curr.val == b) isBexist = true;

                if(curr.left != null && curr.right != null){
                    if((curr.left.val == a && curr.right.val == b) ||
                            (curr.left.val == b && curr.right.val == a)){
                        return false; // parent are same;
                    }
                }

                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            if(isAexist && isBexist) return true;
        }

        return false;
    }
}
