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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return rec(root.left,root.right);
    }
    public static boolean rec(TreeNode l,TreeNode r){
        if(l==null && r==null){
            return true;
        }
        if(l==null || r==null || l.val!=r.val){
            return false;
        }
        return rec(l.left,r.right) && rec(l.right,r.left);
    }
}