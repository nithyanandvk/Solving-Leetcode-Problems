class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ans = ans + rec(i, j, s);
            }
        }
        return ans;
    }

    public int rec(int s, int e, String ss) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arr[] = new int[26];
        for (int i = s; i <= e; i++) {
            int x = ss.charAt(i) - 'a';
            arr[x]++;
        }
        for (int i = 0; i < 26; i++) {
            int x = arr[i];
            if (x > 0) {
                if (max < x) {
                    max = x;
                }
                if (min > x) {
                    min = x;
                }
            }
        }
        return max - min;
    }
}