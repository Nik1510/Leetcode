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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right ){
            return head; // nothing to reverse
        }
        ListNode prev = null;
        ListNode current = head;
        // bringing the current to l-1
        for(int i=0; i<left-1 && current!=null;i++){
            prev = current; // updating the prev node and conneting to the original linkedList
            current = current.next; // updating the current node 
        }
        // at the next of loop current pointer will be at Left 
        // and prev pointer will be before the current pointer

        // reversing the linkedlist
        ListNode last = prev; // the left-1 node is saved to last
        ListNode newEnd = current; // the current will be the newEnd
        ListNode next = current.next;

        for(int i=0; current != null && i<(right-left+1)  ; i++){
            current.next = prev; // saving the node before breaking the linkage 
            prev = current ; //
            current = next;
            if(next!= null){
                next = next.next;
            }
        }
        // linkedList Reversed

        if(last!=null){
            last.next = prev; // reversing is between the list
        }
        else{
            head = prev; // start of the node 
        }
        newEnd.next =current; // current is pointing to last node , so now i am pointing the newEnd.next = current 
        return head;
    }
}