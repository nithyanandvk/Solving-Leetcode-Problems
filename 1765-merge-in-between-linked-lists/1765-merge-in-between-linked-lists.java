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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int c=0;
        ListNode a1=null;
        ListNode b1=null;
        ListNode temp=list1;
        while(c<b){
            if(c==a-1){
                a1=temp;
            }
            temp=temp.next;
            c++;
        }
        b1=temp.next;
        a1.next=list2;
        ListNode prev=list2;
        while(list2!=null){
            prev=list2;
            list2=list2.next;
        }
        prev.next=b1;
        return list1;
    }
}