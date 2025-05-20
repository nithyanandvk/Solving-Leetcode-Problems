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
    public int gcd(int a,int b){
        int gcd=1;
        int n=Math.min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode d=head;
        while(head!=null && head.next!=null){
            int a=head.val;
            int b=head.next.val;
            int gcd=gcd(a,b);
            ListNode temp=head.next;
            head.next=new ListNode(gcd);
            head.next.next=temp;
            head=head.next.next;
        }
        return d;
    }
}