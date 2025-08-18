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
    ArrayList<TreeNode> l;
    public void pre(TreeNode root){
        if(root==null){
            return;
        }
        l.add(root);
        pre(root.left);
        pre(root.right);
    }
    public void flatten(TreeNode root) {
        l=new ArrayList<>();
        pre(root);
        if(l.size()==0){
            return;
        }
        TreeNode curr=l.remove(0);
        curr.left=null;
        while(!l.isEmpty()){
            curr.right=l.remove(0);
            curr=curr.right;
            curr.left=null;
        }
    }
}