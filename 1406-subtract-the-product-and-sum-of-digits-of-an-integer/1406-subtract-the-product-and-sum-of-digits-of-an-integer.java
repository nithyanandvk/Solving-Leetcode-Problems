class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1;
        while(n>0){
            int r=n%10;
            p=p*r;
            s=s+r;
            n=n/10;
        }
        return p-s;
    }
}