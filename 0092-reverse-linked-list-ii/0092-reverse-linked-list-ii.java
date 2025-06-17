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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        //ListNode l=head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l = dummy;

        ListNode r = head;
        ListNode t = head;
        for (int i = 1; i < left; i++) {
            l = l.next;
        }
        ListNode la = l;
        l = l.next;
        for (int i = 1; i < right; i++) {
            r = r.next;
        }
        ListNode ra = r.next;
        r.next = null;
        ListNode curr = l;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        la.next = prev;
        l.next = ra;
        return dummy.next;
    }
}