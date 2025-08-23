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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ArrayList<Integer> l=new ArrayList<>();
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        int n=l.size();
        int x=n/k;
        temp=new ListNode(-1);
        head=temp;
        for(int i=0;i<x;i++){
            for(int j=i*k+k-1;j>=i*k;j--){
                temp.next=new ListNode(l.get(j));
                temp=temp.next;
            }
        }
        if(x*k!=n){
            for(int i=x*k;i<n;i++){
                temp.next=new ListNode(l.get(i));
                temp=temp.next;
            }
        }
        return head.next;
    }
}