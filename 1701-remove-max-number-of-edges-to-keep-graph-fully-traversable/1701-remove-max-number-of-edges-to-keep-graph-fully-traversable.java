class Solution {
    int rank[];
    int par[];
    int c;

    public int find(int n) {
        if (n == par[n]) {
            return n;
        }
        return par[n] = find(par[n]);
    }

    public boolean union(int f, int s) {
        int a = find(f);
        int b = find(s);
        if (a == b) {
            return false;
        }
        if (rank[a] == rank[b]) {
            par[b] = a;
            rank[a]++;
        } else if (rank[a] > rank[b]) {
            par[b] = a;
        } else {
            par[a] = b;
        }
        return true;
    }

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        ArrayList<int[]> t3 = new ArrayList<>();
        ArrayList<int[]> t2 = new ArrayList<>();
        ArrayList<int[]> t1 = new ArrayList<>();
        rank = new int[n + 1];
        par = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            par[i] = i;
        }
        c = 0;
        for (int arr[] : edges) {
            if (arr[0] == 1) {
                t1.add(arr);
            } else if (arr[0] == 2) {
                t2.add(arr);
            } else {
                t3.add(arr);
            }
        }

        for (int arr[] : t3) {
            if (union(arr[1], arr[2])) {
                c++;
            }
        }
        int rankb[] = rank.clone();
        int parb[] = par.clone();
        for (int arr[] : t1) {
            if (union(arr[1], arr[2])) {
                c++;
            }
        }
        int f = 0;
        for (int i = 1; i <= n; i++) {
            if (find(i) == i) {
                f++;
            }
        }
        if (f > 1) {
            return -1;
        }

        rank = rankb;
        par = parb;
        for (int arr[] : t2) {
            if (union(arr[1], arr[2])) {
                c++;
            }
        }
        f = 0;
        for (int i = 1; i <= n; i++) {
            if (find(i) == i) {
                f++;
            }
        }
        if (f > 1) {
            return -1;
        }
        return edges.length - c;
    }
}