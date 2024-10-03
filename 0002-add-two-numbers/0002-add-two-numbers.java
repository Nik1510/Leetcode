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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0); // created a node
        ListNode ptr = result; // created a ptr which will point to result
        int carry =0;
        while(l1!=null || l2!=null){
            int sum =0+carry;
            if(l1!=null){
                sum += l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2=l2.next;
            }
            carry = sum /10;
            sum = sum%10;
            ptr.next = new ListNode(sum); // adding sum as a new node 
            ptr=ptr.next;
        }
        if(carry>0){
            ptr.next = new ListNode(carry);
        }
        return result.next;
    }
}