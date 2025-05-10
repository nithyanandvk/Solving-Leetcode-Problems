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
    HashMap<Integer, Long> h = new HashMap<>();

    public long kthLargestLevelSum(TreeNode root, int k) {
        dfs(root, 1);
        ArrayList<Long> al = new ArrayList<>();
        for (int i = 1; i <= h.size(); i++) {
            al.add(h.get(i));
        }
        Collections.sort(al, Collections.reverseOrder());
        if (k > al.size()) {
            return -1;
        }
        return al.get(k - 1);

    }

    public void dfs(TreeNode n, int l) {
        if (n == null) {
            return;
        }
        h.put(l, (long)(h.getOrDefault(l,(long) 0) +n.val));
        dfs(n.left, l + 1);
        dfs(n.right, l + 1);
    }
}