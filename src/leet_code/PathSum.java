package leet_code;
// https://leetcode.com/problems/path-sum/description/
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return solve(root, targetSum, 0);
    }

    private boolean solve(TreeNode root, int targetSum, int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            sum+=root.val;
            return targetSum == sum;
        }

        boolean left = solve(root.left, targetSum, sum+root.val);
        boolean right = solve(root.right, targetSum, sum+root.val);

        return left || right;
    }
}
