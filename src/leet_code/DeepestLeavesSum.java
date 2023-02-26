package leet_code;
// https://leetcode.com/problems/deepest-leaves-sum/description/
import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        int level = levelCount(root);
        System.out.println("level = " + level);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int nullCount = 1;
        int sum = 0;
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
                nullCount++;
            }
            else{
                if(level == nullCount){
                    sum+= currNode.val;
                }
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }

        return sum;
    }

    public static int levelCount(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftNodes = levelCount(root.left);
        int rightNodes = levelCount(root.right);

        int maxHeight =  Math.max(leftNodes, rightNodes)+1;
        return maxHeight;
    }
}
