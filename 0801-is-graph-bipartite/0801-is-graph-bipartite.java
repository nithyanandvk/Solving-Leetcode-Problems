class Solution {
    class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public boolean isBipartite(int[][] g) {
        ArrayList<Edge> graph[]=new ArrayList[g.length];
        int V=g.length;
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<g[i].length;j++){
                graph[i].add(new Edge(i,g[i][j]));
            }
        }
        int col[]=new int[V];
        Arrays.fill(col,-1);
        for(int i=0;i<V;i++){
            if(col[i]==-1){
                col[i]=0;
                if(!help(graph,col,i)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean help(ArrayList<Edge> graph[],int col[],int curr){
        for(Edge e:graph[curr]){
            if(col[e.dest]==-1){
                col[e.dest]=col[curr]==0?1:0;
                if(!help(graph,col,e.dest)){
                    return false;
                }
            }else if(col[curr]==col[e.dest]){
                return false;
            }
        }
        return true;
    }
}