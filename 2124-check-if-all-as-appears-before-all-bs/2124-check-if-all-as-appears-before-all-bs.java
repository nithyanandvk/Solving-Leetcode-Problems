class Solution {
    public boolean checkString(String s) {
        int n=s.length();
        int b=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                b=i;
                break;
            }
        }
        int a=-1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='a'){
                a=i;
                break;
            }
        }
        if(a==-1){
            return true;
        }
        if(b==-1){
            return true;
        }
        if(a<b){
            return true;
        }
        return false;
    }
}