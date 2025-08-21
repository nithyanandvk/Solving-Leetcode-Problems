class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int n = word.length();
        if (n > 24) {
            int x = n - 24;
            ans = ans + x * 4;
            n=n-x;
        }
        if (n > 16) {
            int x = n - 16;
            ans = ans + x * 3;
            n=n-x;
        }
        if (n > 8) {
            int x = n - 8;
            ans = ans + x * 2;
            n=n-x;
        }
        if (n <= 8) {
            ans=ans+n;
        }
        return ans;
    }
}