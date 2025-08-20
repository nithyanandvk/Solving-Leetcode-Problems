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
    public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }

    public ListNode mergeSort(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode m=mid(head);
        ListNode right=m.next;
        m.next=null;
        ListNode nl=mergeSort(head);
        ListNode nr=mergeSort(right);
        return merge(nl,nr);
    }

    public ListNode merge(ListNode l,ListNode r){
        ListNode dummy=new ListNode(-1);
        ListNode x=dummy;
        while(l!=null && r!=null){
            if(l.val<=r.val){
                dummy.next=l;
                l=l.next;
                dummy=dummy.next;
            }else{
                dummy.next=r;
                r=r.next;
                dummy=dummy.next;
            }
        }
        if(l!=null){
            dummy.next=l;
        }
        if(r!=null){
            dummy.next=r;
        }
        return x.next;
    }
}