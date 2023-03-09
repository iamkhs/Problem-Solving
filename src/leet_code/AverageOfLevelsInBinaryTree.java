package leet_code;
// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        // Create an empty list to store the average values of each level
        List<Double> ans = new ArrayList<>();

        // Create a queue to perform level-order traversal of the binary tree
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        // Continue traversing the tree as long as the queue is not empty
        while(!q.isEmpty()){
            // Get the number of nodes in the current level of the tree
            int lvlSize = q.size();

            // Calculate the sum of the values of all nodes in the current level
            double lvlSum = 0;
            for(int i = 0; i<lvlSize; i++){
                // Remove the first node in the queue and add its value to the level sum
                TreeNode curr = q.remove();
                lvlSum += curr.val;

                // Add the left and right child of the current node to the queue if they exist
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

            // Calculate the average value of the current level and add it to the result list
            double avg = lvlSum / lvlSize;
            ans.add(avg);
        }

        // Return the list of average values for each level of the tree
        return ans;
    }
}
