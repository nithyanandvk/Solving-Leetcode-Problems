class Solution {
    public String reversePrefix(String s, int k) {
        char arr[]=s.toCharArray();
        int l=0;
        k--;
        while(l<k){
            char x=arr[l];
            arr[l]=arr[k];
            arr[k]=x;
            l++;
            k--;
        }
        return new String(arr);
    }
}