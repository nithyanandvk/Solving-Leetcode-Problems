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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int x=q.size();
            double sum=0;
            for(int i=0;i<x;i++){
                TreeNode xx=q.poll();
                sum=sum+xx.val;
                if(xx.left!=null){
                    q.add(xx.left);
                }
                if(xx.right!=null){
                    q.add(xx.right);
                }
            }
            ans.add(sum/x);
        }
        return ans;
    }
}