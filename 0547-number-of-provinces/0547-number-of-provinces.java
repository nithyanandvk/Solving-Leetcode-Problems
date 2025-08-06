class Solution {
    public int findCircleNum(int[][] g) {
        int n = g.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;
        List<Integer>[] list=new ArrayList[n];
        for(int i=0;i<n;i++){
            list[i]=new ArrayList<>();

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<g[0].length;j++){
                if(i!=j&&g[i][j]==1){
                list[i].add(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,list,vis);
            }
        }
        return cnt;
    }
    public static void dfs(int i,List<Integer> list[],boolean vis[]){
        vis[i]=true;
        for(int x:list[i]){
            if(!vis[x]){
                dfs(x,list,vis);
            }
        }
    }
}
