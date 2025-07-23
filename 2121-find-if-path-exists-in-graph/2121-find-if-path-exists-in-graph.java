class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        ArrayList<Integer> graph[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        boolean ans = false;
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                ans = ans || dfs(graph, s, d, vis);
                if (ans) {
                    return true;
                }
            }
        }
        return ans;
    }

    public static boolean dfs(ArrayList<Integer> graph[], int s, int d, boolean vis[]) {
        vis[s]=true;
        if (s == d) {
            return true;
        }
        for(int x:graph[s]){
            if(!vis[x]){
                if(dfs(graph,x,d,vis)){
                    return true;
                }
            }
        }
        return false;
    }
}