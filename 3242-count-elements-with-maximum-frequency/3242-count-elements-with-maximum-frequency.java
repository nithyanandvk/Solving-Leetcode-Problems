class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i : nums) {
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (int i : h.values()) {
            if (i > max) {
                max = i;
            }
        }
        int ans = 0;
        for (int x : h.keySet()) {
            if (h.get(x) == max) {
                ans = ans + max;
            }
        }
        return ans;
    }
}