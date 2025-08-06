class Solution {
    public int minChanges(String s) {
        char arr[]=s.toCharArray();
        int ans=0;
        for(int i=0;i<arr.length;i=i+2){
            if(arr[i]!=arr[i+1]){
                ans++;
            }
        }
        return ans;
    }
}