/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA= headA;
        ListNode pointerB= headB;
         while (pointerA != pointerB) {
            // If pointerA reaches the end, switch it to the head of list B
            pointerA = (pointerA == null) ? headB : pointerA.next;
            // If pointerB reaches the end, switch it to the head of list A
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // If they meet, return the intersection node, otherwise null
        return pointerA;
    }
}