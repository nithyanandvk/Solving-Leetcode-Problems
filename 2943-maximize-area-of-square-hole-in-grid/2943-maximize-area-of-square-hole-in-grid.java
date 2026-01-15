class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] h, int[] v) {
        Arrays.sort(h);
        Arrays.sort(v);
        int hm = 1, vm = 1;
        int hc = 1, vc = 1;
        for (int i = 1; i < h.length; i++) {
            if (h[i] == h[i - 1] + 1) {
                hc++;
            } else {
                hc = 1;
            }
            if (hc > hm) {
                hm = hc;
            }
        }
        for (int i = 1; i < v.length; i++) {
            if (v[i] == v[i - 1] + 1) {
                vc++;
            } else {
                vc = 1;
            }
            if (vc > vm) {
                vm = vc;
            }
        }
        int s = Math.min(hm, vm) + 1;
        return s * s;
    }
}
