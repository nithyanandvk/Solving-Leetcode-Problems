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
    ArrayList<Integer> l;
    public void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.left);
        l.add(root.val);
        in(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        l=new ArrayList<>();
        in(root);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            min=Math.min(min,l.get(i)-l.get(i-1));
        }
        return min;
    }
}