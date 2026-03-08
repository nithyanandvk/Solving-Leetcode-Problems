class Solution {
    static HashSet<String> h;
    static String ans;

    public String findDifferentBinaryString(String[] nums) {
        h = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            h.add(nums[i]);
        }
        int n = nums[0].length();
        ans = rec(new StringBuilder(), n);
        return ans;
    }

    public static String rec(StringBuilder sb, int n) {
        if (sb.length() == n) {
            if (!h.contains(sb.toString())) {
                ans = sb.toString();
                return ans;
            }
            return "";
        }
        sb.append("0");
        String a = rec(sb, n);
        sb.deleteCharAt(sb.length() - 1);
        if (!a.equals("")) {
            return a;
        }
        sb.append("1");
        String b = rec(sb, n);
        sb.deleteCharAt(sb.length() - 1);
        if (!b.equals("")) {
            return b;
        }
        return "";
    }
}