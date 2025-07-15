class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int x=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(x>0){
                    sb.append(c);
                }
                x++;
            }else{
                x--;
                if(x>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}