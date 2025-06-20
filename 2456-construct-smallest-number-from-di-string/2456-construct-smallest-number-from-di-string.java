class Solution {
    public String smallestNumber(String s) {
        int n = s.length();
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < n;) {
            if (s.charAt(i) == 'I') {
                i++;
            } else {
                int start = i;
                while (i < n && s.charAt(i) == 'D') {
                    i++;
                }
                reverse(arr, start, i);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int num : arr) {
            ans.append(num);
        }
        return ans.toString();
    }

    private void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
