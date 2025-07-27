class Solution {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    static class Pair implements Comparable<Pair>{
        int src;
        int dist;
        Pair(int src,int dist){
            this.src=src;
            this.dist=dist;
        }
        @Override 
        public int compareTo(Pair a){
            return this.dist-a.dist;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<Edge> g[]=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            g[i]=new ArrayList<>();
        }
        for(int i=0;i<times.length;i++){
            g[times[i][0]].add(new Edge(times[i][0],times[i][1],times[i][2]));
        }
        boolean vis[]=new boolean[n+1];
        dfs(g,vis,k);
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                return -1;
            }
        }
        PriorityQueue<Pair> q=new PriorityQueue<>();
        q.add(new Pair(k,0));
        int dist[]=new int[n+1];
        for(int i=1;i<=n;i++){
            if(i!=k){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        vis=new boolean[n+1];
        vis[k]=true;
        while(!q.isEmpty()){
            Pair curr=q.poll();
            vis[curr.src]=true;
            for(Edge e:g[curr.src]){
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;
                if(dist[u]+wt<dist[v]){
                    dist[v]=dist[u]+wt;
                    q.add(new Pair(v,dist[v]));
                }
            }
        }
        int c=-1;
        //System.out.println(Arrays.toString(dist));
        for(int i=1;i<=n;i++){
            c=Math.max(c,dist[i]);
        }
        return c;
    }
    public static void dfs(ArrayList<Edge> g[],boolean vis[],int curr){
        vis[curr]=true;
        for(Edge e:g[curr]){
            if(!vis[e.dest]){
                dfs(g,vis,e.dest);
            }
        }
    }
}