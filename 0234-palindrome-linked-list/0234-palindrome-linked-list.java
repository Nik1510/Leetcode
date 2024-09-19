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
    public ListNode Mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next!= null){
            fast = fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        while(current!=null  ){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        // first find mid 
        // reverse the linked list from middle
        ListNode m = Mid(head);
        ListNode headSecond = reverse(m);
        ListNode Rereverse = headSecond; // at the end it will be useful to reReverse the LinkedList
        while(head!= null && headSecond != null){
            if(head.val!=headSecond.val){
                return false;
            }
            head= head.next;
            headSecond = headSecond.next;
        }
        reverse(Rereverse);
        return head ==null || headSecond==null;
    }
}