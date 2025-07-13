class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> h=new HashMap<>();
        char x='a';
        for(int i=0;i<key.length();i++){
            char c=key.charAt(i);
            if(c!=' ' && h.get(c)==null){
                h.put(c,x++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<message.length();i++){
            char c=message.charAt(i);
            if(c!=' '){
                sb.append(h.get(c));
            }else{
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}