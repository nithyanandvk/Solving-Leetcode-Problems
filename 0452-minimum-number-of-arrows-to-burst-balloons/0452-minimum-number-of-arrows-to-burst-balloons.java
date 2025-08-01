class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(o->o[1]));
        int c = 1;
        int n = points.length;
        int end = points[0][1];
        for (int i = 1; i < n; i++) {
            if (points[i][0] > end) {
                c++;
                end = points[i][1];
            }
        }
        return c;
    }
}
