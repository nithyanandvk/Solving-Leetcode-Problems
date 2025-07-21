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
    public boolean isUnivalTree(TreeNode root) {
        int x=root.val;
        return rec(root,x);
    }
    public boolean rec(TreeNode root,int x){
        if(root==null){
            return true;
        }
        if(root.val!=x){
            return false;
        }
        return rec(root.left,x) && rec(root.right,x);
    }
}