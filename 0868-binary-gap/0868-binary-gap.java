class Solution {
    public int binaryGap(int n) {
        int l=0,r=0;
        String x=Integer.toBinaryString(n);
        int ans=0;
        for(int i=0;i<x.length();i++){
            char c=x.charAt(r);
            if(c=='1'){
                ans=Math.max(ans,r-l);
                l=i;
            }
            r++;
        }
        return ans;
    }
}