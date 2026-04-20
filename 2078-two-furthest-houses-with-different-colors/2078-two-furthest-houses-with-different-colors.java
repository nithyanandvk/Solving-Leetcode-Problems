class Solution {
    public int maxDistance(int[] colors) {
        //int diff=0;
        // int cdiff;
        // for(int i=0;i<colors.length;i++){
        //     for(int j=i+1;j<colors.length;j++){
        //         if(colors[i]!=colors[j]){
        //             cdiff=j-i;
        //             diff=Math.max(diff,cdiff);
        //         }
        //     }
        // }


        // int n=colors.length;
        // int i=0,j=n-1;
        // while(i<n){
        //     if(colors[i]==colors[n-1]){
        //         i++;
        //     }else{
        //         return n-i-1;
        //     }
        //     if(colors[j]==colors[0]){
        //         j--;
        //     }else{
        //         return j;
        //     }
        // }
        // return -1;

        int si=0;
        int ei=colors.length-1;
        int max=0;
        while(si<ei){
            if(colors[si]!=colors[ei]){
                max=Math.max(max,ei-si);
            }
            ei--;
        }
        ei=colors.length-1;
        while(si<ei){
            if(colors[si]!=colors[ei]){
                max=Math.max(max,ei-si);
            }
            si++;
        }
        return max;
    }
}