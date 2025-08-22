class Solution {
    public String getSmallestString(int n, int k) {
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            arr[i]='a';
        }
        k=k-n;
        n=n-1;
        while(k>0){
            if(k>=25){
                arr[n--]='z';
                k=k-25;
            }else{
                arr[n]=(char)(arr[n]+k);
                break;
            }
        }
        return new String(arr);
    }
}