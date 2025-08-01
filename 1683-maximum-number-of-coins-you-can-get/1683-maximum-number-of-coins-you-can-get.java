class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int sum=0;
        int x=n-2;
        for(int i=0;i<n/3;i++){
            sum=sum+piles[x];
            x=x-2;
        }
        return sum;
    }
}