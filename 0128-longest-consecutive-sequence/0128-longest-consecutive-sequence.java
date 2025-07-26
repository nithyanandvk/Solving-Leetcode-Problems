class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int i : nums) {
            h.add(i);
        }
        int max = 0;
        for (int i : h) {
            if (!h.contains(i - 1)) {
                int count = 1;
                int curr = i;
                while (h.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                if (max < count) {
                    max = count;
                }
            }
        }
        return max;
    }
}
