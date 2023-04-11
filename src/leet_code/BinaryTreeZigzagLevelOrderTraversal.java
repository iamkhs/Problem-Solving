package leet_code;
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
import java.util.*;
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lvl = 0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<n; i++){
                TreeNode curr = q.remove();
                list.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            lvl++;
            if(lvl % 2==0){
                Collections.reverse(list);
            }
            ans.add(list);
        }

        return ans;
    }
}
