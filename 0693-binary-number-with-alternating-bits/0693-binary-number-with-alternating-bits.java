class Solution {
    public boolean hasAlternatingBits(int n) {
        int r=n%2;
        n=n/2;
        while(n>0){
            int x=n%2;
            if(x==r){
                return false;
            }
            r=x;
            n=n/2;
        }
        return true;
    }
}