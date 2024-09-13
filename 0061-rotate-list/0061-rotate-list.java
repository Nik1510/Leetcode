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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }
        
        // Calculate the length of the list
        int length = 1;
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        // Make the list circular
        last.next = head;

        // Calculate the effective number of rotations
        int rotations = k % length;
        int skip = length - rotations;

        // Find the new last node after rotation
        ListNode newLast = head;
        for (int i = 0; i < skip - 1; i++) {
            newLast = newLast.next;
        }

        // Set the new head and break the circular list
        head = newLast.next;
        newLast.next = null;

        return head;
    }
}
