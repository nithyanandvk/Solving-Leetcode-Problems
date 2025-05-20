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
    public int gcd(int i, int j) {
        if (j == 0)
            return i;
        return gcd(j, i % j);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode d = head;
        while (head != null && head.next != null) {
            int a = head.val;
            int b = head.next.val;
            int gcd = gcd(a, b);
            ListNode temp = head.next;
            head.next = new ListNode(gcd);
            head.next.next = temp;
            head = head.next.next;
        }
        return d;
    }
}