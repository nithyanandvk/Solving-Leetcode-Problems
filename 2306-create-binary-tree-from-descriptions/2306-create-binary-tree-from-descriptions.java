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
    static class Pair {
        TreeNode curr;
        int par;
        Pair(TreeNode curr, int par) {
            this.curr = curr;
            this.par = par;
        }
    }

    public TreeNode createBinaryTree(int[][] d) {
        HashMap<Integer, Pair> h = new HashMap<>();
        int n = d.length;
        for (int i = 0; i < n; i++) {
            if (h.containsKey(d[i][0])) {
                TreeNode curr = h.get(d[i][0]).curr;
                TreeNode child;
                if (h.containsKey(d[i][1])) {
                    child = h.get(d[i][1]).curr;
                } else {
                    child = new TreeNode(d[i][1]);
                }
                if (d[i][2] == 1) {
                    curr.left = child;
                } else {
                    curr.right = child;
                }
                h.put(d[i][0], new Pair(curr, h.get(d[i][0]).par));
                h.put(d[i][1], new Pair(child, curr.val));
            } else {
                TreeNode curr = new TreeNode(d[i][0]);
                TreeNode child;
                if (h.containsKey(d[i][1])) {
                    child = h.get(d[i][1]).curr;
                } else {
                    child = new TreeNode(d[i][1]);
                }
                if (d[i][2] == 1) {
                    curr.left = child;
                } else {
                    curr.right = child;
                }
                h.put(d[i][0], new Pair(curr, -1));
                h.put(d[i][1], new Pair(child, curr.val));
            }
        }
        for (int i : h.keySet()) {
            if (h.get(i).par == -1) {
                return h.get(i).curr;
            }
        }
        return null;
    }
}
