package leet_code;
// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        inOrder(root1, list);
        inOrder(root2, list);
        Collections.sort(list);
        return list;
    }

    private void inOrder(TreeNode root, List<Integer> list){
        if(root == null)return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}
