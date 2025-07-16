class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int x=Math.abs(s.charAt(i)-'a'-26);
            sum=sum+x*(i+1);
        }
        return sum;
    }
}