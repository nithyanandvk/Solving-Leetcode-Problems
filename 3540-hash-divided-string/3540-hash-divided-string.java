class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i=i+k){
            int r=i;
            int sum=0;
            while(r<i+k){
                sum=sum+(s.charAt(r)-'a');
                r++;
            }
            sum=sum%26;
            //System.out.println(sum);
            sb.append((char)('a'+sum));
        }
        return sb.toString();
    }
}