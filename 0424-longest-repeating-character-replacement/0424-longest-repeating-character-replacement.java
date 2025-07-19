class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int ans = 0;
        int maxCount = 0;
        int r = 0;
        int l = 0;
        int n = s.length();
        while (r < n) {
            char c = s.charAt(r);
            arr[c - 'A']++;
            maxCount = Math.max(maxCount, arr[c - 'A']);
            if ((r - l + 1) - maxCount > k) {
                arr[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
}
