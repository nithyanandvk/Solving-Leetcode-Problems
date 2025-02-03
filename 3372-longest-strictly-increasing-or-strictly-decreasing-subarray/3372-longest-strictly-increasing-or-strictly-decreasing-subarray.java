class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int n=arr.length;
        int max=1;
        for(int i=0;i<n;i++){
            int c=1;
            for(int j=i;j<n-1;j++){
                if(!(arr[j]<arr[j+1])){
                    break;
                }
                if(arr[j]<arr[j+1]){
                    c++;
                }
            }
            max=Math.max(max,c);
            c=1;
        }

        for(int i=0;i<n;i++){
            int c=1;
            for(int j=i;j<n-1;j++){
                if(!(arr[j]>arr[j+1])){
                    break;
                }
                if(arr[j]>arr[j+1]){
                    c++;
                }
            }
            max=Math.max(max,c);
            c=1;
        }        
        return max;
    }
}