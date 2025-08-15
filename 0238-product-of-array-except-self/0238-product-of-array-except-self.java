class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        // int p = 1;
        // for (int i = 0; i < n; i++) {
        //     p = p * arr[i];
        // }
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] != 0) {
        //         arr[i] = p / arr[i];
        //     }
        // }
        // return arr;

        int p[]=new int[n];
        int curr=1;
        for(int i=0;i<n;i++){
            p[i]=curr;
            curr=curr*arr[i];
        }
        curr=1;
        int s[]=new int[n];
        for(int j=n-1;j>=0;j--){
            s[j]=curr;
            curr=curr*arr[j];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=p[i]*s[i];
        }
        return ans;
    }
}