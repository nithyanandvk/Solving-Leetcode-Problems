class Solution {
    class Pair{
        int d;
        int f;
        Pair(int d,int f){
            this.d=d;
            this.f=f;
        }
    }
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=arr.length;
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        Pair brr[]=new Pair[h.size()];
        int i=0;
        for(int x:h.keySet()){
            brr[i]=new Pair(x,h.get(x));
            i++;
        }
        Arrays.sort(brr,(a,b)->b.f-a.f);
        i=0;
        int c=0;
        while(c<n/2){
            c=c+brr[i].f;
            i++;
        }
        return i;
    }
}