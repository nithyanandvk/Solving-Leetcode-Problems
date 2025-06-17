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
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
        ListNode curr=head;
        while(curr!=null){
            h.put(curr.val,h.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        for(int e:h.keySet()){
            if(h.get(e)==1){
                dummy.next=new ListNode(e);
                dummy=dummy.next;
            }
        }
        return ans.next;
    }
}