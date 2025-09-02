class Solution {
    public boolean halvesAreAlike(String s) {
        int c=0;
        int n=s.length();
        for(int i=0;i<n/2;i++){
            char x=s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
                c++;
            }
        }
        for(int i=n/2;i<n;i++){
            char x=s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U'){
                c--;
            }
        }
        return c==0;
    }
}