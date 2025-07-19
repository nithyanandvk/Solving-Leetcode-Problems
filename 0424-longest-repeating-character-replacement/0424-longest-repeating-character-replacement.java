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
            while ((r - l + 1) - maxCount > k) {
                arr[s.charAt(l) - 'A']--;
                maxCount=maxi(arr);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }

        return ans;
    }
    public static int maxi(int arr[]){
        int m=0;
        for(int i=0;i<arr.length;i++){
            m=Math.max(m,arr[i]);
        }
        return m;
    }
}
