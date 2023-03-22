package leet_code;
// https://leetcode.com/problems/binary-tree-paths/description/
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<String> ans = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        solve(root, "");
        return ans;
    }

    private void solve(TreeNode root, String path){
        if(root == null) return;

        path+=String.valueOf(root.val);
        if(root.left != null || root.right != null){
            path+="->";
        }
        if(root.left == null && root.right == null){
            ans.add(path);
            return;
        }

        solve(root.left, path);
        solve(root.right, path);
    }
}
