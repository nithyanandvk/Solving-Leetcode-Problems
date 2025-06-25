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
    static ArrayList<String> al;

    public List<String> binaryTreePaths(TreeNode root) {
        al = new ArrayList<>();
        path(new ArrayList<>(), root);
        return al;
    }

    public static void path(ArrayList<Integer> l, TreeNode root) {
        if (root == null) {
            return;
        }
        l.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < l.size(); i++) {
                if (i != l.size() - 1) {
                    ans.append(l.get(i) + "->");
                } else {
                    ans.append(l.get(i));
                }
            }
            al.add(ans.toString());
        } else {
            path(l, root.left);
            path(l, root.right);
        }
        l.remove(l.size() - 1);

    }
}