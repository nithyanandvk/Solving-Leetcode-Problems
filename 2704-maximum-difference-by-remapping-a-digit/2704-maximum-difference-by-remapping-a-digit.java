class Solution {
    public int minMaxDifference(int n) {
        String s = n + "";
        char[] a = s.toCharArray();
        char[] b = s.toCharArray();
        char x = ' ';
        for (char c : a) {
            if (c != '9') {
                x = c;
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                a[i] = '9';
            }
        }
        char y = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] == y) {
                b[i] = '0';
            }
        }
        return Integer.parseInt(new String(a)) - Integer.parseInt(new String(b));
    }
}
