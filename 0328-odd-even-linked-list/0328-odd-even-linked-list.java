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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Return if list is empty or has only one node
        }

        // Create dummy heads for odd and even lists
        ListNode odd = new ListNode(0); 
        ListNode even = new ListNode(0); 
        ListNode oddHead = odd;  // Track the head of odd list
        ListNode evenHead = even;  // Track the head of even list

        int k = 1; // To determine if current node is odd or even

        while (head != null) {
            if (k % 2 != 0) {
                odd.next = new ListNode(head.val);  // Assign odd node
                odd = odd.next;
            } else {
                even.next = new ListNode(head.val); // Assign even node
                even = even.next;
            }
            head = head.next; // Move to next node in original list
            k++; // Increment the counter to switch between odd and even
        }

        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead.next;

        return oddHead.next; // Skip the dummy node and return the real head of the odd list
    }
}
