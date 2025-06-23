/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> al;

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            al.add(root.val);
            inorder(root.right);
        }
    }

    public boolean isValidBST(TreeNode root) {
        // al=new ArrayList<>();
        // inorder(root);
        // for(int i=0;i<al.size()-1;i++){
        //     if(al.get(i)>=al.get(i+1)){
        //         return false;
        //     }
        // }
        // return true;
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValid(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}