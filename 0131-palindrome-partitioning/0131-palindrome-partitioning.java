class Solution {
    List<List<Integer>> l;
    List<List<String>> ans;
    public List<List<String>> partition(String s) {
        ans=new ArrayList<>();
        int n=s.length();
        rec(new ArrayList<String>(),0,n,s);
        //System.out.println(ans);
        List<List<String>> pal=new ArrayList<>();
        for(List<String> al:ans){
            boolean check=true;
            for(String x:al){
                check=check && palindrome(x);
            }
            if(check){
                pal.add(al);
            }
        }
        return pal;
    }
    public void rec(ArrayList<String> al,int curr,int n,String s){
        if(curr>=n){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=curr;i<n;i++){
            al.add(s.substring(curr,i+1));
            rec(al,i+1,n,s);
            al.remove(al.size()-1);
        }
    }
    public boolean palindrome(String x){
        int l=0;
        int r=x.length()-1;
        while(l<r){
            if(x.charAt(l)!=x.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}