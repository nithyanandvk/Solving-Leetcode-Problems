class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int m=baskets.length;
        int ans=0;
        for(int i=0;i<n;i++){
            boolean check=false;
            for(int j=0;j<m;j++){
                if(fruits[i]<=baskets[j]){
                    check=true;
                    baskets[j]=0;
                    break;
                }
            }
            if(!check){
                ans++;
            }
        }
        return ans;
    }
}