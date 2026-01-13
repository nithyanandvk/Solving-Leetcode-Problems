class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = score[i];
        }
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        for (int i = 0; i < n; i++) {
            int idx = arr[i][0];
            if (i == 0) ans[idx] = "Gold Medal";
            else if (i == 1) ans[idx] = "Silver Medal";
            else if (i == 2) ans[idx] = "Bronze Medal";
            else ans[idx] = String.valueOf(i + 1);
        }
        return ans;
    }
}
