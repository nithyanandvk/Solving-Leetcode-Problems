class Solution {
    public boolean isBalanced(String num) {
        int e = 0;
        int o = 0;
        int n = num.length();
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                e=e+Integer.parseInt(num.charAt(i)+"");
            }else{
                o=o+Integer.parseInt(num.charAt(i)+"");
            }
        }
        return e==o;
    }
}