class Solution {
    public int countTestedDevices(int[] b) {
        int ans=0;
        int n=b.length;
        for(int i=0;i<n;i++){
            if(b[i]>0){
                ans++;
                for(int j=i+1;j<n;j++){
                    if(b[j]>0){
                        b[j]--;
                    }
                }
            }
        }
        return ans;
    }
}