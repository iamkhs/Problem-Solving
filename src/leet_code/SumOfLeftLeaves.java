package leet_code;
// https://leetcode.com/problems/sum-of-left-leaves/description/
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left == null && root.right == null){
            return 0;
        }
        return sum(root, 0);
    }
    private int sum(TreeNode root, int sum){
        if(root == null) return sum;
        if(isLeaf(root.left)){
            sum+=root.left.val;
        }
        sum = sum(root.left, sum);
        sum = sum(root.right, sum);
        return sum;
    }

    private boolean isLeaf(TreeNode root){
        if(root == null) return false;
        return root.left == null && root.right == null;
    }
}
