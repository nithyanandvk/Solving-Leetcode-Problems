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
    public static int sum=0;
    public int rangeSumBST(TreeNode root, int k1, int k2) {
        sum=0;
        rangeSumBSTT(root,k1,k2);
        return sum;
    }

    public void rangeSumBSTT(TreeNode root, int l, int h) {
        if(root==null){
            return;
        }
        if(l<=root.val && root.val<=h){
            rangeSumBSTT(root.left,l,h);
            sum=sum+root.val;
            rangeSumBSTT(root.right,l,h);
        }else if(root.val>h){
            rangeSumBSTT(root.left,l,h);
        }else{
            rangeSumBSTT(root.right,l,h);
        }
    }
}