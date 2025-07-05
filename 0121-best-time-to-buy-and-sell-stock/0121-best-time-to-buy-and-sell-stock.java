class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int p=prices[0];
        for(int i=1;i<prices.length;i++){
            int curr=0;
            if(p>prices[i]){
                p=prices[i];
            }else{
                curr=prices[i]-p;
                max=Math.max(max,curr);
            }
        }
        return max;
    }
}