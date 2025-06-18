/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public static int count(ListNode head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        // while(a!=null){
        //     while(b!=null){
        //         if(a==b){
        //             return a;
        //         }
        //         b=b.next;
        //     }
        //     b=headB;
        //     a=a.next;
        // }

        // while(a!=b){
        //     if(a==null){
        //         a=headB;
        //     }else{
        //         a=a.next;
        //     }
        //     if(b==null){
        //         b=headA;
        //     }else{
        //         b=b.next;
        //     }
        // }
        // return a;

        int ac = count(a);
        int bc = count(b);
        if (ac > bc) {
            while (ac != bc) {
                a = a.next;
                ac--;
            }
        } else if (bc > ac) {
            while (ac != bc) {
                b = b.next;
                bc--;
            }
        }
        while(a!=b){
            a=a.next;
            b=b.next;
        }
        return a;
    }
}