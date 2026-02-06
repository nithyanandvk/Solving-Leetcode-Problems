class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
       for(String x:strs){
        boolean check=false;
        for(char c:x.toCharArray()){
            if(Character.isLetter(c)){
                max=Math.max(max,x.length());
                check=true;
                break;
            }
        }
        if(!check){
            max=Math.max(max,Integer.parseInt(x));
        }
       } 
       return max;
    }
}