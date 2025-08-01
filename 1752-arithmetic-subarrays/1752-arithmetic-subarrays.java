class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int ls = l.length;
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < ls; i++) {
            ans.add(rec(nums, l[i], r[i]));
        }
        return ans;
    }

    public static boolean rec(int nums[], int l, int r) {
        int n = r - l + 1;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[l++];
        }
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] - arr[i - 1] != d) {
                return false;
            }
        }
        return true;
    }
}