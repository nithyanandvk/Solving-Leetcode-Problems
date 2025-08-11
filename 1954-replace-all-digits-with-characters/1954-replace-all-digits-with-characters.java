class Solution {
    public String replaceDigits(String s) {
      int n=s.length();
      char ans[]=new char[n];
      for(int i=0;i<n-1;i=i+2){
        ans[i]=s.charAt(i);
        ans[i+1]=(char)(ans[i]+(s.charAt(i+1)-'0'));
      }
      if(n%2!=0){
        ans[n-1]=s.charAt(n-1);
      }
      return new String(ans);  
    }
}