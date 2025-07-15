class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        rec(new ArrayList<>(),l);
        return res;
    }
    public void rec(ArrayList<Integer> li,ArrayList<Integer> l){
        if(l.size()==0){
            res.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<l.size();i++){
            int n=l.remove(i);
            li.add(n);
            rec(li,l);
            li.remove(li.size()-1);
            l.add(i,n);
        }
    }
}