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
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode newHead = prev;
        int max = newHead.val;
        ListNode dummy = new ListNode(0, newHead);
        curr = newHead;
        while (curr != null && curr.next != null) {
            if (curr.next.val < max) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr.val;
            }
        }
        prev = null;
        curr = dummy.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}