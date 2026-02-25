class Solution {
    public int[] sortByBits(int[] a) {
        Integer[] b = new Integer[a.length];
        for(int i = 0; i < a.length; i++)
            b[i] = a[i];
        Arrays.sort(b, (x, y) -> {
            int c1 = Integer.bitCount(x);
            int c2 = Integer.bitCount(y);
            if(c1 == c2) return x - y;
            return c1 - c2;
        });
        for(int i = 0; i < a.length; i++)
            a[i] = b[i];
        return a;
    }
}