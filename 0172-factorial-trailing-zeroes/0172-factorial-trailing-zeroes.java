class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        int x=1;
        while(n/(x*5)>=1){
            x=x*5;
            c=c+(n/x);
        }
        return c;
    }
}