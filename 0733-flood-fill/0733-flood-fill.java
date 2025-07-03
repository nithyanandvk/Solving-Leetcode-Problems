class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int o = image[sr][sc];
        if (o!= color) {
            rec(image, sr, sc, color, o);
        }
        return image;
    }

    public static void rec(int[][] image, int r, int c, int x, int t) {
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length || image[r][c] != t ) {
            return;
        }
        image[r][c] = x;
        rec(image, r + 1, c, x, t);
        rec(image, r - 1, c, x, t);
        rec(image, r, c + 1, x, t);
        rec(image, r, c - 1, x, t);
    }

}