class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int n=A.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            h.put(A[i],h.getOrDefault(A[i],0)+1);
            h.put(B[i],h.getOrDefault(B[i],0)+1);
            int c=0;
            for(int x:h.keySet()){
                if(h.get(x)==2){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}