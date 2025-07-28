class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(mat[i], Integer.MAX_VALUE/2);
            mat[i][i]=0;
        }
        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            int wt = edges[i][2];
            mat[x][y] = wt;
            mat[y][x] = wt;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = Math.min(mat[i][j], mat[i][k] + mat[k][j]);
                }
            }
        }
        int max = Integer.MAX_VALUE; // it is min
        int city = -1;
        int z=0;
        for (int arr[] : mat) {
                       // System.out.println(Arrays.toString(arr));
            // Arrays.sort(arr);
            int curr = 0;
            int t = distanceThreshold;
            
            for (int i : arr) {
                if (i!=0 && i!=Integer.MAX_VALUE && i <= t) {
                    curr++;
                }
            }

            if (max >= curr) {
                max = curr;
                city = z;
            }
            z++;
        }
        return city;
    }
}