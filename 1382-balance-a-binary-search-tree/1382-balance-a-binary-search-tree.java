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
    ArrayList<Integer> l=new ArrayList<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }
    public TreeNode balanceBST(TreeNode root) {
        l=new ArrayList<>();
        inorder(root);
        return rec(l,0,l.size()-1);
    }
    public static TreeNode rec(ArrayList<Integer> li,int l,int r){
        if(l>r){
            return null;
        }
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(li.get(mid));
        root.left=rec(li,l,mid-1);
        root.right=rec(li,mid+1,r);
        return root;
    }
}