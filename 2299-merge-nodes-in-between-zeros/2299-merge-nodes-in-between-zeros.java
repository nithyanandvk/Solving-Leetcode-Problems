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
    public ListNode mergeNodes(ListNode head) {
        ListNode l = head.next;
        ListNode r = head.next;
        ListNode ans = new ListNode(-1);
        ListNode a = ans;
        int sum = 0;
        while (r != null) {
            if (r.val != 0) {
                sum += r.val;
            } else {
                ans.next = new ListNode(sum);
                ans = ans.next;
                sum = 0;
            }
            r = r.next;
        }
        return a.next;
    }
}