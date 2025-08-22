class Solution {
    class Pair{
        int i;
        int c;
        Pair(int i,int c){
            this.i=i;
            this.c=c;
        }
    }
    public int getKth(int lo, int hi, int k) {
        Pair arr[]=new Pair[hi-lo+1];
        for(int i=lo;i<=hi;i++){
            int x=i;
            int c=0;
            while(x!=1){
                if(x%2==0){
                    x=x/2;
                }else{
                    x=3*x+1;
                }
                c++;
            }
            arr[i-lo]=new Pair(i,c);
        }
        Arrays.sort(arr,(a,b)->a.c-b.c);
        return arr[k-1].i;
    }
}