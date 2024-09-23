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
   
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null ){
            return null;
        }
        ListNode prev= null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next != null){
            fast= fast.next.next;
            prev= slow;
            slow = slow.next;
        }
        // when the loop end slow will be at the mid and the prev will be before thr mid
        // so if we connect the prev with the next of slow
        // therefore we successfully skipped the mid node  
        if(prev != null){
        prev.next= slow.next;
        }
        return head;
    }
}