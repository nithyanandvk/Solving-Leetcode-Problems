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
    ArrayList<Integer> l=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null){
            l.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return l;
    }
}