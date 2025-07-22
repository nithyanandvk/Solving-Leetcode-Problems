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
    public TreeNode deleteNode(TreeNode root, int x) {
        if(root==null){
            return root;
        }
        if(x<root.val){
            root.left=deleteNode(root.left,x);
        }else if(x>root.val){
            root.right=deleteNode(root.right,x);
        }else{
            if(root.left == null && root.right==null){
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                TreeNode ans=rec(root.left);
                int z=root.val;
                root.val=ans.val;
                ans.val=z;
                root.left= deleteNode(root.left,x);
            }
        }
        return root;
    }
    public static TreeNode rec(TreeNode root){
        while(root.right!=null){
            root=root.right;
        }
        return root;
    }
}