class Solution {
    public int[] shuffle(int[] arr, int n) {
        int l=0;
        int r=n;
        int temp[]=new int[2*n];
        for(int i=0;i<2*n;i+=2){
            temp[i]=arr[l];
            temp[i+1]=arr[r];
            l++;r++;
        }
        return temp;
    }
}