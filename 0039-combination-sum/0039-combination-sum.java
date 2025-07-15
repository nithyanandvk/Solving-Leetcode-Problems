class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] c, int t) {
        ans=new ArrayList<>();
        rec(c,t,0,0,new ArrayList<>());
        return ans;
    }
    public void rec(int c[],int t,int start,int sum,ArrayList<Integer> l){
        if(sum==t){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(sum>t){
            return;
        }
        for(int i=start;i<c.length;i++){
            l.add(c[i]);
            rec(c,t,i,sum+c[i],l);
            l.remove(l.size()-1);
        }
    }

}