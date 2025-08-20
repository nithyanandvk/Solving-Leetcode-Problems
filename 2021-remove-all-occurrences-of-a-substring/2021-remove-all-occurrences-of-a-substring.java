class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st=new Stack<>();
        Stack<Character> stt=new Stack<>();
        int n=part.length();
        char f=part.charAt(n-1);
        for(char x:s.toCharArray()){
            st.push(x);
            if(x==f && st.size()>=n){
                int l=n-1;
                while(l>=0 && st.peek()==part.charAt(l)){
                    stt.push(st.pop());
                    l--;
                }
                if(l<0){
                    stt.clear();
                }else{
                    while(!stt.isEmpty()){
                        st.push(stt.pop());
                    }
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}