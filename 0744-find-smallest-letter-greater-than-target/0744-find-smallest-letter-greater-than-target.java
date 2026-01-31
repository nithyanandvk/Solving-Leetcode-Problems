class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target=='z'){
            return letters[0];
        }
        char c=(char)(target+1);
        while(c<='z'){
            for(char x:letters){
                if(x==c){
                    return c;
                }
            }
            c=(char)(c+1);
        }
        return letters[0];
    }
}