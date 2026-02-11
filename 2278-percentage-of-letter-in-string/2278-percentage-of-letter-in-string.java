class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int c=0;
        for(char x:s.toCharArray()){
            if(x==letter){
                c++;
            }
        }
        return c*100/n;
    }
}