class Pair{
    char c;
    int cnt;
    Pair(char c,int cnt){
        this.c=c;
        this.cnt=cnt;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        // Stack<Character> ans=new Stack<>();
        // Stack<Character> st=new Stack<>();
        // for(char c:s.toCharArray()){
        //     if(ans.size()>=k-1){
        //         while(st.size()!=k-1){
        //             if(ans.peek()==c){
        //                 st.push(ans.pop());
        //             }else{
        //                 break;
        //             }
        //         }
        //         if(st.size()==k-1){
        //             st=new Stack<>();
        //         }else{
        //             while(!st.isEmpty()){
        //                 ans.push(st.pop());
        //             }
        //             ans.push(c);
        //         }
        //     }else{
        //         ans.push(c);
        //     }
        // }
        // StringBuilder sb=new StringBuilder();
        // while(!ans.isEmpty()){
        //     sb.append(ans.pop());
        // }
        // return sb.reverse().toString();
        Stack<Pair> st=new Stack<>();
        for(char x:s.toCharArray()){
            if(!st.isEmpty() && st.peek().c==x){
                st.peek().cnt++;
            }else{
                st.push(new Pair(x,1));
            }
            if(st.peek().cnt==k){
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            Pair curr=st.pop();
            int x=curr.cnt;
            while(x>0){
                sb.append(curr.c);
                x--;
            }
        }
        return sb.reverse().toString();
    }
}