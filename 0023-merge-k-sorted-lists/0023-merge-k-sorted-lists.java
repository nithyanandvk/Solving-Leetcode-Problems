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
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0){
            return null;
        }
        ListNode l=lists[0];
        for(int i=1;i<n;i++){
            ListNode dummy=new ListNode(-1);
            ListNode temp=dummy;
            ListNode r=lists[i];
            while(l!=null && r!=null){
                if(l.val<=r.val){
                    dummy.next=l;
                    dummy=dummy.next;
                    l=l.next;
                }else{
                    dummy.next=r;
                    dummy=dummy.next;
                    r=r.next;
                }
            }
            if(l!=null){
                dummy.next=l;
            }
            if(r!=null){
                dummy.next=r;
            }
            l=temp.next;
        }
        return l;
    }
}