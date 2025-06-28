import java.util.*;

class Solution {
    class Point {
        int data;
        int i;
        Point(int data, int i) {
            this.data = data;
            this.i = i;
        }
    }

    public int[] maxSubsequence(int[] nums, int k) {
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new Point(nums[i], i));
        }

        Collections.sort(list, (a, b) -> b.data - a.data);
        List<Point> topK = list.subList(0, k);
        Collections.sort(topK, (a, b) -> a.i - b.i);

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = topK.get(i).data;
        }

        return ans;
    }
}
