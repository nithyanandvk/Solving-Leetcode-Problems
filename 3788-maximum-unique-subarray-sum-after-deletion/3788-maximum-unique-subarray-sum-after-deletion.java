class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            max=Math.max(max,n);
        }
        if (max<0){
            return max;
        }

        Set<Integer> h= new HashSet<>();
        for (int n : nums) {
            h.add(n);
        }
        int sum = 0;
        for (int i : h) {
            if (i > 0) {
                sum += i;
            }
        }

        return sum;
    }
}
