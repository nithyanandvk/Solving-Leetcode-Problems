class Solution {
    public int maxProfit(int[] arr) {
        int max=0;
        int n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]-arr[i]>max){
        //             max=arr[j]-arr[i];
        //         }
        //     }
        // }

        int buy=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>buy){
                max=Math.max(max,arr[i]-buy);
            }else{
                buy=arr[i];
            }
        }
        return max;
    }
}