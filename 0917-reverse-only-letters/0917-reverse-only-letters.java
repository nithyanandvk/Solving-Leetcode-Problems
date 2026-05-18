class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if((arr[l]<65)||(arr[l]>90 && arr[l]<97) || (arr[l]>122)){
                l++;
            }else if((arr[r]<65)||(arr[r]>90 && arr[r]<97) || (arr[r]>122)){
                r--;
            }else{
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        return String.valueOf(arr);
    }
}