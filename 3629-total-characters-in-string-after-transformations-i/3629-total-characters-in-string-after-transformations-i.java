class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod = 1000000007;
        int[] f = new int[26];
        for (char c : s.toCharArray()) {
            f[c - 'a']++;
        }
        while (t-- > 0) {
            int[] nf = new int[26];
            for (int i = 0; i < 26; i++) {
                int cnt = f[i];
                if (cnt == 0) {
                    continue;
                }
                if (i == 25) {
                    nf[0] = (nf[0] + cnt) % mod;
                    nf[1] = (nf[1] + cnt) % mod;
                } else {
                    nf[i + 1] = (nf[i + 1] + cnt) % mod;
                }
            }
            f = nf;
        }
        int res = 0;
        for (int x : f) {
            res = (res + x) % mod;
        }
        return res;
    }
}
