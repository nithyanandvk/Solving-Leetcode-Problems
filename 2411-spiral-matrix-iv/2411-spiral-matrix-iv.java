/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][] = new int[m][n];
        for (int arr[] : ans) {
            Arrays.fill(arr, -1);
        }
        int t = 0, l = 0, r = n - 1, b = m - 1;
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                if (head == null) {
                    return ans;
                }
                ans[t][i] = head.val;
                head = head.next;
            }
            t++;
            for (int i = t; i <= b; i++) {
                if (head == null) {
                    return ans;
                }
                ans[i][r] = head.val;
                head = head.next;
            }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    if (head == null) {
                        return ans;
                    }
                    ans[b][i] = head.val;
                    head = head.next;
                }
            }
            b--;
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    if (head == null) {
                        return ans;
                    }
                    ans[i][l] = head.val;
                    head = head.next;
                }
            }
            l++;
        }
        return ans;
    }
}