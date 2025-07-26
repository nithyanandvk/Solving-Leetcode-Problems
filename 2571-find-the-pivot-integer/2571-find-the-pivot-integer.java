class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int a=sum(i);
            int b=sum(n);
            if(a==b-a+i){
                return i;
            }
        }
        return -1;
    }
    static int sum(int n){
        return (n*(n+1))/2;
    }
}