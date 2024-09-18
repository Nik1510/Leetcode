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
        // chek if there will be reversal
        if(left == right){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        // bringing current to left node and prev to left-1
        for(int i=0;current!=null && i<left-1 ;i++ ){
            prev = current;
            current = current.next ;
        }
        // current comes to left 
        // prev comes to left -1
        ListNode last = prev;
        ListNode newEnd = current;
        ListNode next = current.next;

        for(int i=0; i<right -left+1 && current!= null ; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        // list is reversed between left and right 

        if(last!= null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current ;
        return head;
    }
}