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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        return rec(root);
    }
    public boolean rec(TreeNode root){
        if(root==null){
            return true;
        }
        int d=height(root.left)-height(root.right);        
        if(d > 1 || d < -1){
            return false;
        }
        return rec(root.left) && rec(root.right);
    }
}