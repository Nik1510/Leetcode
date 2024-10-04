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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode (0);
        dummyHead.next=head;
        ListNode left = dummyHead;
        ListNode right = dummyHead;

        // bringing the right pointer to n nodes ahead
        for(int i =0; i<n;i++){
            right = right.next;
        }
        while(right.next!=null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummyHead.next;
    }
}