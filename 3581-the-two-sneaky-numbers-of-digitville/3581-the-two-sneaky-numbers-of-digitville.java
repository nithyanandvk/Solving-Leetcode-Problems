class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int i=0;
        int arr[]=new int[2];
        for(Map.Entry<Integer,Integer> e:h.entrySet()){
            if(e.getValue()==2){
                arr[i]=e.getKey();
                i++;
            }
        }
        return arr;
    }
}