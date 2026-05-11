class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:nums){
            String s=Integer.toString(x);
            for(char c:s.toCharArray()){
                l.add(c-'0');
            }
        }
        int arr[]=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}