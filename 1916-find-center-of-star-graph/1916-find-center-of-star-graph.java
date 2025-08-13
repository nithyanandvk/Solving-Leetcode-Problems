class Solution {
    public int findCenter(int[][] edges) {
        HashSet<Integer> h=new HashSet<>();
        h.add(edges[0][0]);
        h.add(edges[0][1]);
        if(h.contains(edges[1][0])){
            return edges[1][0];
        }else{
            return edges[1][1];
        }        
    }
}