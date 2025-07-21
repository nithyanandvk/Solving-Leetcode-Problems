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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
       List<TreeNode> ans=new ArrayList<>();
       rec(root,ans,new HashMap<>());
       return ans; 
    }
    public String rec(TreeNode root,List<TreeNode> ans,HashMap<String,Integer> h){
        if(root==null){
            return "#";
        }
        String s=root.val+","+rec(root.left,ans,h)+","+rec(root.right,ans,h);
        h.put(s,h.getOrDefault(s,0)+1);
        if(h.get(s)==2){
            ans.add(root);
        }
        return s;
    }
}