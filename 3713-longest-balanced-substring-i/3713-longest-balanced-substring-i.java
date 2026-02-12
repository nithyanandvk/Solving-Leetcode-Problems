class Solution {
    public int longestBalanced(String s) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int arr[] = new int[26];
            int max = 0;
            for (int j = i; j < n; j++) {
                char x = s.charAt(j);
                arr[x - 'a']++;
                max = Math.max(max, arr[x - 'a']);
                boolean check = true;
                int count = 0;
                for (int k = 0; k < 26; k++) {
                    if (arr[k] != 0) {
                        if (arr[k] != max) {
                            check = false;
                            break;
                        }
                        count++;
                    }
                }
                if (check) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
