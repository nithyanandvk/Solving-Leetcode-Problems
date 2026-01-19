class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean ans[]=new boolean[101];
        for(List<Integer> x:nums){
            for(int i=x.get(0);i<=x.get(1);i++){
                ans[i]=true;
            }
        }
        int c=0;
        for(int i=1;i<=100;i++){
            if(ans[i]){
                c++;
            }
        }
        return c;
    }
}