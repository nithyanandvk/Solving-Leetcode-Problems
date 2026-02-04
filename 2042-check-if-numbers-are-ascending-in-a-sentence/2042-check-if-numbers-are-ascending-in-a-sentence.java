class Solution {
    public boolean areNumbersAscending(String s) {
        boolean ans=true;
        String ss[]=s.split(" ");
        int xx=0;
        for(String x:ss){
            if(Character.isDigit(x.charAt(0))){
                int a=Integer.parseInt(x);;
                if(xx==0){
                    xx=a;
                }else{
                    if(a>xx){
                        xx=a;
                    }else{
                        return false;
                    }
                }
            }
        }
        return ans;
    }
}