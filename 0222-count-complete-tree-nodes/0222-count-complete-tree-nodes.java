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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int c1=countNodes(root.left);
        int c2=countNodes(root.right);
        return 1+c1+c2;
    }
}