class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        int l=0;
        int r=1;
        int c=1;
        ans=ans.append(s.charAt(0));
        while(r<n){
            char x=s.charAt(r);
            if(x==ans.charAt(l)){
                c++;
                if(c<3){
                    ans.append(x);
                    l++;
                    r++;
                }else if(c>=3){
                    r++;
                }
            }else{
                c=1;
                ans.append(x);
                r++;
                l++;
            }
        }
        return ans.toString();
    }
}