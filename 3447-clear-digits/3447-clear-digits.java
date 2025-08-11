class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}