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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        q.add(root);
        q.add(null);
        TreeNode prev=root;
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                if (q.isEmpty()) {
                    ans.add(prev.val);
                    return ans;
                } else {
                    ans.add(prev.val);
                    q.add(null);
                }
            } else {   
                prev=curr;             
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }
}