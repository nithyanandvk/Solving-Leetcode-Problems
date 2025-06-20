class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=i;
        }
        for(int i=0;i<n;){
            char c=s.charAt(i);
            if(c=='I'){
                i++;
            }else{
                int x=i;
                while(i<n && s.charAt(i)=='D'){
                    i++;
                }
                rev(arr,x,i);
            }
        }
        return arr;
    }
    public static void rev(int arr[],int l,int r){
        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
    }
}