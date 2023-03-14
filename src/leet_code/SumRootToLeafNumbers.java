package leet_code;
// https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbers {
    List<Integer> ansList = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        root2Leaf(root, new ArrayList<>());
        int sum = 0;
        for (Integer integer : ansList) {
            sum += integer;
        }
        return sum;
    }

    private void root2Leaf(TreeNode root, List<Integer> list){
        if(root == null) return;
        list.add(root.val);

        if(root.left == null && root.right == null){
            StringBuilder sb = new StringBuilder();
            for (Integer integer : list) {
                sb.append(integer);
            }

            ansList.add(Integer.valueOf(sb.toString()));
        }

        else{
            root2Leaf(root.left, list);
            root2Leaf(root.right, list);
        }

        list.remove(list.size()-1);
    }
}
