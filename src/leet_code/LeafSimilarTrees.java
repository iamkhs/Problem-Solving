package leet_code;
// https://leetcode.com/problems/leaf-similar-trees/description/
import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> first = new ArrayList<>();
        leafNodes(root1, first);
        List<Integer> second = new ArrayList<>();
        leafNodes(root2, second);
        if(first.size() != second.size())return false;
        int i = 0;
        int j = 0;
        while(j< second.size() && i < first.size()){
            if (first.get(i) != second.get(j)){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public void leafNodes(TreeNode root, List<Integer> list){
        if(root == null)return;

        if(root.left == null && root.right == null){
            list.add(root.val);
        }

        leafNodes(root.left, list);
        leafNodes(root.right, list);
    }
}
