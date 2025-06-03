class Solution {
    ArrayList<Integer> l = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        l.add(root.val);
        inorder(root.right);
    }

    public TreeNode bstToGst(TreeNode root) {
        if (l.size() == 0) {
            inorder(root);
            int sum = 0;
            for (int i = l.size() - 1; i >= 0; i--) {
                sum += l.get(i);
                map.put(l.get(i), sum);
            }
        }
        if (root == null) return null;
        root.val = map.get(root.val);
        root.left = bstToGst(root.left);
        root.right = bstToGst(root.right);
        return root;
    }
}
