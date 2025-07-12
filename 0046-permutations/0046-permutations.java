class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        for (int n : nums) {
            num.add(n);
        }
        backtrack(num,new ArrayList<>());
        return res;
    }
    public void backtrack(ArrayList<Integer> num,ArrayList<Integer> li){
        if(num.size()==0){
            //System.out.println(li);
            res.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<num.size();i++){
            li.add(num.get(i));
            int x=num.remove(i);            
            backtrack(num,li);
            li.remove(li.size() - 1);    
            num.add(i, x);
        }
    }
}