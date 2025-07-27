class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> l = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int n = intervals.length;
        int[] prev = intervals[0];
        for (int i = 1; i < n; i++) {
            if (prev[1] >= intervals[i][0]) {
                prev[1] = Math.max(prev[1], intervals[i][1]);
            } else {
                l.add(prev);
                prev = intervals[i];
            }
        }
        l.add(prev);
        int[][] ans = new int[l.size()][2];
        int i = 0;
        for (int[] arr : l) {
            ans[i++] = new int[]{arr[0], arr[1]};
        }
        return ans;
    }
}
