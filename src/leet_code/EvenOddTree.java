package leet_code;
//https://leetcode.com/problems/even-odd-tree/
import java.util.*;
public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        if(root.val % 2 == 0)return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int lvl = 0;

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            int temp;
            for(int i = 0; i<n; i++){
                TreeNode curr = q.remove();
                temp = curr.val;
                if(lvl % 2 == 0){
                    if(curr.val % 2 == 0){
                        return false;
                    }
                }else {
                    if(curr.val % 2 != 0){
                        return false;
                    }
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
                if(!isSorted(list, temp, lvl))return false;
                list.add(curr.val);
            }
            lvl++;
        }
        return true;
    }

    private static boolean isSorted(List<Integer> list, int temp, int lvl){
        if(!list.isEmpty()){
            int v = list.get(list.size()-1);
            if(lvl % 2 == 0){
                return temp > v;
            }else{
                return temp < v;
            }
        }
        return true;
    }
}
