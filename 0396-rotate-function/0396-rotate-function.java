class Solution {
    public int maxRotateFunction(int[] arr) {
        int n = arr.length, sum = 0, val = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            val += i * arr[i];
        }

        int max = val;

        for (int i = n - 1; i > 0; i--) {
            val = val + sum - n * arr[i];
            max = Math.max(max, val);
        }

        return max;
    }
}