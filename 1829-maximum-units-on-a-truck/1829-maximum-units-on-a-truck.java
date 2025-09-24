class Solution {
    public int maximumUnits(int[][] b, int s) {
        Arrays.sort(b,Comparator.comparingInt(a->a[1]));
        int ans=0;
        int n=b.length;
        for(int i=n-1;i>=0;i--){
            while(s>0 && b[i][0]>0){
                ans=ans+b[i][1];
                s--;
                b[i][0]--;
            }
        }
        return ans;
    }
}