class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer, PriorityQueue<Integer>> h = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (h.get(i - j) == null) {
                    h.put(i - j, new PriorityQueue<>());
                }
                h.get(i - j).add(mat[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                mat[i][j]=h.get(i-j).poll();
            }
        }
        return mat;
    }
}