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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<List<Integer>> st = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> l = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                if (q.isEmpty()) {
                    st.push(new ArrayList<>(l));
                    while (!st.isEmpty()) {
                        ans.add(st.pop());
                    }
                    return ans;
                } else {
                    st.push(new ArrayList<>(l));
                    q.add(null);
                    l.clear();
                }
            } else {
                l.add(curr.val);
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