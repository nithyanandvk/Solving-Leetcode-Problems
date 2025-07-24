class Solution {
    static ArrayList<String> ans;
    public List<String> letterCombinations(String digits) {
        String kb[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        rec(digits,kb,new StringBuilder(),0);
        return ans;
    }
    public static void rec(String digits,String kb[],StringBuilder curr,int id){
        if(curr.length()==digits.length()){
            ans.add(curr.toString());
            return;
        }
        String s=kb[digits.charAt(id)-'2'];
        for(int i=0;i<s.length();i++){
            curr.append(s.charAt(i));
            rec(digits,kb,curr,id+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
