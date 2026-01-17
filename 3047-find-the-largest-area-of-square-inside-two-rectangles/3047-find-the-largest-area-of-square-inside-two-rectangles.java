class Solution {
    public long largestSquareArea(int[][] b, int[][] t) {
        int n = b.length;
        long max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width  = Math.min(t[i][0], t[j][0]) - Math.max(b[i][0], b[j][0]);
                int height = Math.min(t[i][1], t[j][1]) - Math.max(b[i][1], b[j][1]);
                if (width > 0 && height > 0) {
                    int side = Math.min(width, height);
                    max = Math.max(max, (long) side * side);
                }
            }
        }
        return max;
    }
}
