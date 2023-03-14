package leet_code;
// https://leetcode.com/problems/range-sum-of-bst/description/
public class RangeSumOfBST {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val >= low && root.val <= high){
            rangeSumBST(root.left, low, high);
            sum+=root.val;
            rangeSumBST(root.right, low, high);
        }

        else if(root.val >= high){
            rangeSumBST(root.left, low, high);
        }

        else{
            rangeSumBST(root.right, low, high);
        }

        return sum;
    }
}
