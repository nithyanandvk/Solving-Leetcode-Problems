class Solution {
    public int maximumUniqueSubarray(int[] arr) {
        int l = 0;
        int r = 0;
        int max = 0;
        int curr = 0;
        HashSet<Integer> li = new HashSet<>();
        while (r < arr.length) {
            int x = arr[r];
            if (!li.contains(x)) {
                li.add(x);
                curr = curr + x;
                max = Math.max(max, curr);
                r++;
            } else {
                while (arr[l] != x) {
                    li.remove(arr[l]);
                    curr = curr - arr[l];
                    l++;
                }
                li.remove(arr[l]);
                curr = curr - arr[l];
                l++;

            }
        }
        return max;
    }
}