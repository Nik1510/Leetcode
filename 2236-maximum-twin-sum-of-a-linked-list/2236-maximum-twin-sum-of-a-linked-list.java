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
    public ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode curr= head;
        ListNode next = curr.next;
        while(curr!= null){
            curr.next = prev;
            prev= curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode h2 = reverse(slow);
        int c =0;
        while(h2!=null){
            int sum = h2.val+head.val;
            c= Math.max(sum,c);
            head= head.next;
            h2=h2.next;
        }
        return c;
    }
}