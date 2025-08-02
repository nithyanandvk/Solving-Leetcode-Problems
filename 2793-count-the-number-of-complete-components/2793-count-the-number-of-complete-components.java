class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<Integer> graph[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        boolean vis[] = new boolean[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                ArrayList<Integer> ans = new ArrayList<>();
                dfs(graph, i, ans, vis);
                // System.out.println(ans);
                if (rec(ans, graph)) {
                    //System.out.println(ans);
                    c++;
                }
            }
        }
        return c;
    }

    public static void dfs(ArrayList<Integer> graph[], int curr, ArrayList<Integer> ans, boolean vis[]) {
        vis[curr] = true;
        ans.add(curr);
        for (int i : graph[curr]) {
            if (!vis[i]) {
                dfs(graph, i, ans, vis);
            }
        }
    }

    public static boolean rec(ArrayList<Integer> ans, ArrayList<Integer> graph[]) {
        int sum = 0;
        for (int i : ans) {
            sum = sum + graph[i].size();
        }
        int m = ans.size();
        return sum == 2 * (m * (m - 1) / 2);
    }
}