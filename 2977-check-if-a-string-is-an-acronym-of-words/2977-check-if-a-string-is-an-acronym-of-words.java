class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb=new StringBuilder();
        for(String ss:words){
            sb.append(ss.charAt(0));
        }
        return sb.toString().equals(s);
    }
}