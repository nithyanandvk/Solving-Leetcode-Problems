class Solution {
    public List<String> readBinaryWatch(int on) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==on){
                    ans.add(i+":"+(j<10?"0"+j:j));
                }
            }
        }
        //System.out.println(ans);
        return ans;
    }
}