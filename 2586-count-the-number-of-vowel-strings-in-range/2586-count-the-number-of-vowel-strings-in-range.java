class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            String x = words[i];
            boolean check = false;
            if (x.charAt(0) == 'a' || x.charAt(0) == 'e' || x.charAt(0) == 'i' || x.charAt(0) == 'o'
                    || x.charAt(0) == 'u') {
                check = true;
                if (check) {
                    int n = x.length()-1;
                    if (x.charAt(n) == 'a' || x.charAt(n) == 'e' || x.charAt(n) == 'i' || x.charAt(n) == 'o'
                            || x.charAt(n) == 'u') {
                        check = true;
                    }else{
                        check=false;
                    }
                }
            }
            if (check) {
                ans++;
            }
        }
        return ans;
    }
}