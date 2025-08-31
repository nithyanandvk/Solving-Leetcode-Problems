class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int i=0;
        int j=0;
        StringBuilder sb=new StringBuilder();
        while(i<a && j<b){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        if(i!=0){
            sb.append(word1.substring(i));
        }
        if(j!=0){
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }
}