package leet_code;

// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
import java.util.*;
public class SecondMinimumNodeInABinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> list = new HashSet<>();
        inOrder(root, list);
        if(list.size() <2){
            return -1;
        }
        List<Integer> ans = new ArrayList<>(list);
        Collections.sort(ans);
        return ans.get(1);
    }

    private void inOrder(TreeNode root, Set<Integer> list){
        if(root == null) return;
        list.add(root.val);
        inOrder(root.left, list);
        inOrder(root.right, list);
    }
}
