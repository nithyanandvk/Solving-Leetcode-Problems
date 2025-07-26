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
    public static int c;
    static class Info{
        int c;
        int sum;
        Info(int c,int sum){
            this.c=c;
            this.sum=sum;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        c=0;
        rec(root);
        return c;
    }
    public static Info rec(TreeNode root){
        if(root==null){
            return new Info(0,0);
        }
        Info l=rec(root.left);
        Info r=rec(root.right);
        if(root.val==(l.sum+r.sum+root.val)/(l.c+r.c+1)){
            c++;
        }
        return new Info(l.c+r.c+1,l.sum+r.sum+root.val);
    }
}