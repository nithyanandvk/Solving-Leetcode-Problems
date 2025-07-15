class Solution {
    public String reversePrefix(String word, char ch) {
        int i=0;
        int n=word.length();
        for(;i<n;i++){
            if(word.charAt(i)==ch){
                break;
            }
        }
        if(i>=n){
            return word;
        }
        StringBuilder sb=new StringBuilder(word.substring(0,i+1));
        return sb.reverse().toString()+word.substring(i+1);
    }
}