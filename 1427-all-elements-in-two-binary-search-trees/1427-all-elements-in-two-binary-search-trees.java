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
    public static void inorder(TreeNode root, ArrayList<Integer> l) {
        if(root==null){
            return;
        }
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        inorder(root1,a);
        inorder(root2,b);
        List<Integer> ans=new ArrayList<>();
        int sa=a.size();
        int sb=b.size();
        int i=0;
        int j=0;
        while(i<sa && j<sb){
            int n=a.get(i);
            int m=b.get(j);
            if(n<=m){
                ans.add(n);
                i++;
            }else{
                ans.add(m);
                j++;
            }
        }
        while(i<sa){
            ans.add(a.get(i));
            i++;
        }
        while(j<sb){
            ans.add(b.get(j));
            j++;
        }
        return ans;
    }
}