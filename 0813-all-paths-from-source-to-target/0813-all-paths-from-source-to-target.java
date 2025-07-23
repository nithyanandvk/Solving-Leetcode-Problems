class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans=new ArrayList<>();
        boolean vis[]=new boolean[graph.length];
        dfs(graph,new ArrayList<>(),0,graph.length-1,vis);
        return ans;
    }
    public static void dfs(int graph[][],ArrayList<Integer> l,int src,int dest,boolean vis[]){
        l.add(src);
        vis[src]=true;
        if(src==dest){
            ans.add(new ArrayList<>(l));
        }
        for(int i=0;i<graph[src].length;i++){
            dfs(graph,l,graph[src][i],dest,vis);
        }
        vis[src]=false;
        l.remove(l.size()-1);
    }
}