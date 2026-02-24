class Solution {
    ArrayList<String> l = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        l = new ArrayList<>();
        rec(root, new StringBuilder());
        int ans=0;
        for (String x : l) {
            ans = ans + Integer.parseInt(x, 2);
        }
        return ans;
    }

    public void rec(TreeNode root, StringBuilder x) {
        if (root == null)
            return;

        x.append(root.val);

        if (root.left == null && root.right == null) {
            l.add(x.toString());
        } else {
            rec(root.left, x);
            rec(root.right, x);
        }

        x.deleteCharAt(x.length() - 1);
    }
}