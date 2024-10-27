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
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode p1 = reverse(head);
        ListNode p2 = p1;
        ListNode prev = null;
        int carry =0;
        while(p1!=null){
            int sum = 2*p1.val+carry;
            carry = sum/10;
            p1.val = sum%10;
            prev = p1;
            p1 = p1.next;
        }
        if(carry>0){
            prev.next = new ListNode(carry);
        }
        return reverse(p2);
    }
}