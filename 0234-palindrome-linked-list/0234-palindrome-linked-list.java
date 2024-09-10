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
    public ListNode Middle(ListNode head){
        ListNode  f= head;
        ListNode s = head;
        while(f!=null && f.next!=null){
             s = s.next;
             f = f.next.next;
        }
        return s;
    }
    public ListNode Rev(ListNode head){
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present!=null){
            present.next = prev;
            prev =present;
            present =next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = Middle(head);
        ListNode headSecond = Rev(mid) ;
        ListNode reReverse = headSecond;

        // Now compare both list

        while(head!=null && headSecond!=null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond =headSecond.next;
        }
        Rev(reReverse);
    return head==null||headSecond ==null;

    }
}