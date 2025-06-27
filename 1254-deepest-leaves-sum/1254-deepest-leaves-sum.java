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
    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    static int s=0;
    public static void sum(TreeNode root,int l,int max){
        if(root==null){
            return;
        }
        if(l==max){
            s=s+root.val;
            return;
        }
        sum(root.left,l+1,max);
        sum(root.right,l+1,max);
    }
    public int deepestLeavesSum(TreeNode root) {
        s=0;
        int max=height(root);
        sum(root,1,max);
        return s;
    }
}