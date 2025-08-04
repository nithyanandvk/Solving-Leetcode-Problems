class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans=0;
        int curr=capacity;
        for(int i=0;i<plants.length;i++){
            if(curr<plants[i]){
                ans=ans+2*i+1;
                curr=capacity-plants[i];
            }else{
                ans++;
                curr=curr-plants[i];
            }
        }
        return ans;
    }
}