class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            int x=c-'0';
            if(max<x){
                max=x;
            }
        }
        return max;
    }
}