class Solution {
    static int ans = -1;
    public int longestCycle(int[] edges) {
        ans = -1;
        int n = edges.length;
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                Map<Integer, Integer> map = new HashMap<>();
                rec(i, edges, vis, map, 0);
            }
        }
        return ans;
    }

    public static void rec(int curr, int edges[], boolean vis[], Map<Integer, Integer> map, int x) {
        if (curr == -1) return;
        if (map.containsKey(curr)) {
            ans = Math.max(ans, x - map.get(curr)); 
            return;
        }
        if (vis[curr]) return;
        vis[curr] = true;
        map.put(curr, x);
        rec(edges[curr], edges, vis, map, x + 1);
        map.remove(curr); 
    }
}
