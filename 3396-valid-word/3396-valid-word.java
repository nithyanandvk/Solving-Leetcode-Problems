class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3){
            return false;
        }
        if(word.contains(Character.toString('@')) || word.contains(Character.toString('#')) || word.contains(Character.toString('$'))){
            return false;
        }
        String v="aeiouAEIOU";
        boolean vo=false;
        boolean co=false;
        for(int i=0;i<n;i++){
            char c=word.charAt(i);
            if(v.contains(Character.toString(c))){
                vo=true;
            }else if(c>='0' && c<='9'){

            }else{
                co=true;
            }
            if(vo && co){
                return true;
            }
        }
        return false;
    }
}