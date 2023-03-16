package leet_code;
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)return null;
        return construct(nums, 0, nums.length-1);
    }

    private TreeNode construct(int[] nums, int left, int right){
        if(left > right)return null;
        int mid = left+(right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = construct(nums, left, mid-1);
        node.right = construct(nums, mid+1, right);
        return node;
    }
}
