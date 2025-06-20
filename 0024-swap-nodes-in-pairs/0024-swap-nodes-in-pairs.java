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
    public ListNode swapPairs(ListNode head) {
        // if(head==null || head.next==null){
        //     return head;
        // }else{
        //     ListNode temp=head.next;
        //     head.next=swapPairs(head.next.next);
        //     temp.next=head;
        //     return temp;
        // }

        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        ListNode prev = dummy;
        ListNode next = curr.next;
        while (curr != null && curr.next != null) {
            ListNode temp = next.next;
            next.next = curr;
            curr.next = temp;
            prev.next = next;
            prev = curr;
            if (curr!=null && curr.next != null) {
                curr = curr.next;
                if (curr.next != null) {
                    next = curr.next;
                }
            }
        }
        return dummy.next;
    }
}