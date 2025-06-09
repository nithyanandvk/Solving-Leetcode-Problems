class Solution {
    public String interpret(String str) {
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='G'){
                ans=ans+"G";
            }else if(str.charAt(i)=='(' && str.charAt(i+1)==')'){
                ans=ans+"o";
                i++;
            }else{
                ans=ans+"al";
                i=i+3;
            }
        }
        return ans;
    }
}