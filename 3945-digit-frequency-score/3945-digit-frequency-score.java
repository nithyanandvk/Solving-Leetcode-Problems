class Solution {
    public int digitFrequencyScore(int n) {
        int arr[]=new int[10];
        while(n>0){
            int r=n%10;
            arr[r]++;
            n=n/10;
        }
        int ans=0;
        for(int i=0;i<10;i++){
            ans=ans+i*arr[i];
        }
        return ans;
    }
}