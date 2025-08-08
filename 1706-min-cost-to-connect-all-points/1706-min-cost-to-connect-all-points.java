class Solution {
    class Edge implements Comparable<Edge> {
        int x;
        int y;
        int dist;

        Edge(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public int compareTo(Edge a) {
            return this.dist - a.dist;
        }
    }

    public static int rank[];
    public static int par[];

    public static void init(int n) {
        rank = new int[n];
        par = new int[n];
        Arrays.fill(rank, 0);
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int n) {
        if (n == par[n]) {
            return n;
        }
        return par[n]=find(par[n]);
    }

    public static boolean union(int a, int b) {
        int pa = find(a);
        int pb = find(b);
        if (pa == pb) {
            return false;
        }
        if (rank[pa] == rank[pb]) {
            par[pb] = pa;
            rank[pa]++;
        } else if (rank[pa] > rank[pb]) {
            par[pb] = pa;
        } else {
            par[pa] = pb;
        }

        return true;
    }

    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Edge> edges = new PriorityQueue<>();
        int n = points.length;
        init(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dist = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new Edge(i, j, dist));
            }
        }
        int c = 0;
        int ans = 0;
        while(!edges.isEmpty()){
            Edge e = edges.poll();
            // System.out.println(e.x+" "+e.y+" "+e.dist);
            if (union(e.x, e.y)) {
                c++;
                ans = ans + e.dist;
            }
            if (c == n - 1) {
                return ans;
            }
        }
        return ans;
    }
}