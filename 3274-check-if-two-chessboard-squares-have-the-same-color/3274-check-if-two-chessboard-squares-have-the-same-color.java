class Solution {
    public boolean checkTwoChessboards(String a, String b) {
        int c1 = (a.charAt(0) - 'a') + (a.charAt(1) - '0');
        int c2 = (b.charAt(0) - 'a') + (b.charAt(1) - '0');
        return (c1 % 2) == (c2 % 2);
    }
}
