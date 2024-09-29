/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int lengthOfCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow =slow.next;
            if(fast==slow){
                int length =0;
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
        //edge condition 
        ListNode fast = head;
        ListNode slow = head;
        int length =0;
        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }
        ListNode f = head;
        ListNode s = head;

        // making s reach the loop 
        while(length>0){
            s = s.next;
            length--;
        }

        while(f!=s){
            f= f.next;
            s=s.next;
        }
        return f;
    }
}