class Solution {
    public List<String> stringSequence(String target) {
        ArrayList<String> ans = new ArrayList<>();
        int n = target.length();
        int i = 0;
        char f='a';
        ans.add(f+"");
        while(f!=target.charAt(i)){
            f++;
            ans.add(f+"");
        }
        StringBuilder sb=new StringBuilder(f+"");
        while(i<n-1){
            i++;
            char t=target.charAt(i);
            char c='a';
            sb.append(c);
            while(c!=t){
                sb.setCharAt(i,c);
                ans.add(sb.toString());
                c++;
            }
            sb.setCharAt(i,c);
            ans.add(sb.toString());
        }
        return ans;
    }
}