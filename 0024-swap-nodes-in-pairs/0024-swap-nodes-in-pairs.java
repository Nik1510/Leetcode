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
    public ListNode swapPairs(ListNode head) {
        if(head== null || head.next==null){
            return head;
        }
        ListNode h2= head;
        while(head!=null && head.next!=null){
            // swap(head.val, head.next.val);
            int temp = head.val;
            head.val=head.next.val;
            head.next.val=temp;
            head=head.next.next;
        }
        return h2;
    }
}