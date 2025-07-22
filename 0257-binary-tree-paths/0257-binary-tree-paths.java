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
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans=new ArrayList<>();
        rec(root,new ArrayList<>());
        return ans;
    }
    public void rec(TreeNode root,ArrayList<Integer> li){
        if(root==null){
            return;
        }
        li.add(root.val);
        if(root.left==null && root.right==null){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<li.size();i++){
                if(i!=li.size()-1){
                    sb.append(li.get(i)+"->");
                }else{
                    sb.append(li.get(i));
                }
            }
            ans.add(sb.toString());
        }
        rec(root.left,li);
        rec(root.right,li);
        li.remove(li.size()-1);
    }
}