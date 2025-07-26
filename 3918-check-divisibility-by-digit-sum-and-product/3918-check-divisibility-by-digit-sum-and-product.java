class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int temp=n;
        while(n>0){
            int r=n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        return (temp%(s+p))==0;
    }
}