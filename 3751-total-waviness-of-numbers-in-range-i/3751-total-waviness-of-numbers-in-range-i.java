class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int x=num1;x<=num2;x++){
            String n=x+"";
            if(n.length()>=3){
                for(int i=1;i<n.length()-1;i++){
                    if((n.charAt(i)>n.charAt(i-1)) && (n.charAt(i)>n.charAt(i+1))){
                        ans++;
                    }

                    if((n.charAt(i)<n.charAt(i-1)) && (n.charAt(i)<n.charAt(i+1))){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}