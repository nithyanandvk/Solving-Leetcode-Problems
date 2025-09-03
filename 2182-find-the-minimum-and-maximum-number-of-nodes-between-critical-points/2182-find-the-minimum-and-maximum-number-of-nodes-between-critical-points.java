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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> l = new ArrayList<>();
        int ans[] = { -1, -1 };
        int prev = head.val;
        head = head.next;
        int i = 1;
        while (head.next != null) {
            if (head.val > prev && head.val > head.next.val) {
                l.add(i);
            } else if (head.val < prev && head.val < head.next.val) {
                l.add(i);
            }
            i++;
            prev = head.val;
            head = head.next;
        }
        if (l.size() <= 1) {
            return ans;
        }
        int min = Integer.MAX_VALUE;
        for (i = 0; i < l.size() - 1; i++) {
            int x = l.get(i + 1) - l.get(i);
            if (x < min) {
                min = x;
            }

        }
        ans[0] = min;
        ans[1] = l.get(l.size() - 1) - l.get(0);
        return ans;
    }
}