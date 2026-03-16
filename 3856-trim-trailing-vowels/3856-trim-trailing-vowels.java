class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.charAt(sb.length()-1)=='a' || sb.charAt(sb.length()-1)=='e' ||
        sb.charAt(sb.length()-1)=='i' || sb.charAt(sb.length()-1)=='o' || sb.charAt(sb.length()-1)=='u'){
            if(sb.length()==1){
                return "";
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}