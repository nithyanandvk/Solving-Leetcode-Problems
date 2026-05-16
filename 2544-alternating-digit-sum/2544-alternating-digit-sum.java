class Solution {
    public int alternateDigitSum(int n) {
        String x=n+"";
        int ans=0;
        for(int i=0;i<x.length();i++){
            if(i%2==0){
                ans=ans+x.charAt(i)-'0';
            }else{
                ans=ans-x.charAt(i)+'0';
            }
        }
        return ans;
    }
}