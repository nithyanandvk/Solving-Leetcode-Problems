class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        List<String> ans=new ArrayList<>();
        for(String x:q){
            for(String y:d){
                if(x.equals(d)){
                    ans.add(x);
                    break;
                }
                int c=0;
                for(int k=0;k<x.length();k++){
                    if(x.charAt(k)!=y.charAt(k)){
                        c++;
                    }
                }
                if(c<=2){
                    ans.add(x);
                    break;
                }
            }
        }
        return ans;
    }
}