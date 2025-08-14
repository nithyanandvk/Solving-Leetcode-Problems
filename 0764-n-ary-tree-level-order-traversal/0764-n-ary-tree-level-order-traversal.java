/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> li=new ArrayList<>();
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null){
                if(q.isEmpty()){
                    ans.add(li);
                    return ans;
                }else{
                    q.add(null);
                    ans.add(new ArrayList<>(li));
                    li.clear();
                }
            }else{
                li.add(curr.val);
                for(Node x:curr.children){
                    if(x!=null){
                        q.add(x);
                    }
                }
            }
        }
        return ans;
    }
}