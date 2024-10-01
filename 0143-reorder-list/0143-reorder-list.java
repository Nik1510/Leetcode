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
    // first get the mid of LinkedList 
    public ListNode mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast =fast.next.next;
        }
        return slow; // return  mid 
    }
    // reverse the middle
    public ListNode reverse(ListNode head){
        if(head==null || head.next ==null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        while(current!=null){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next ==null){
            return ;
        }
        ListNode middle = mid(head); // i got the mid
        ListNode hf = head; 
        ListNode hs = reverse(middle); 

        while(hf!=null && hs !=null){
            ListNode temp = hf.next;
            hf.next = hs; // first node connected to last node
            hf = temp ; // updating headFirst to head.next ;

            // for next half
            temp = hs.next; // storing head second in temporary variable 
            hs.next =hf;
            hs = temp; // updating hs 
        }
        // edge case 
        if(hf!=null){
            hf.next = null;
        }
    }
}