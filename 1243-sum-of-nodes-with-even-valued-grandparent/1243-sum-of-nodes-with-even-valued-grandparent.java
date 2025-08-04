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
    static int ans;
    public int sumEvenGrandparent(TreeNode root) {
        ans=0;
        rec(root.left,root.val,-1);
        rec(root.right,root.val,-1);
        return ans;
    }
    public static void rec(TreeNode root,int p,int g){
        if(root==null){
            return;
        }
        if(g%2==0){
            ans=ans+root.val;
        }
        rec(root.left,root.val,p);
        rec(root.right,root.val,p);
    }
}