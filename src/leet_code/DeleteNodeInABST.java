package leet_code;
// https://leetcode.com/problems/delete-node-in-a-bst/description/
public class DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(key> root.val){
            root.right = deleteNode(root.right, key);
        }

        else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }

        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            else{
                TreeNode inOrderSuccessor = getInOrderSuccessor(root.right);
                root.val = inOrderSuccessor.val;
                root.right = deleteNode(root.right, inOrderSuccessor.val);
            }
        }

        return root;
    }

    private TreeNode getInOrderSuccessor(TreeNode node){
        while(node.left != null){
            node = node.left;
        }

        return node;
    }
}
