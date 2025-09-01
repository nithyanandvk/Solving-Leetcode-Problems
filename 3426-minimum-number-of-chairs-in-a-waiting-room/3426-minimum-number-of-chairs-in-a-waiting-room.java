class Solution {
    public int minimumChairs(String s) {
        int max=Integer.MIN_VALUE;
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='E'){
                cnt++;
                if(cnt>max){
                    max=cnt;
                }
            }else{
                cnt--;
            }
        }
        return max;
    }
}