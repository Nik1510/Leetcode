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
    public int[] val(ListNode head){
        ArrayList<Integer> arr= new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head= head.next;
        }
        int[] a = new int[arr.size()];
        int i =0;
        while(i<arr.size()){
            a[i] = arr.get(i);
            i++;
        }
        return a;
    }
    public int[] nextLargerNodes(ListNode head) {
        int[] arr= val(head);
        int n = arr.length;
        int[] a= new int[n];
        for(int i =0; i<n ; i++){
            for(int j =i+1; j<n;j++){
                if(arr[j]>arr[i]){
                    a[i]=arr[j];
                    break;
                }
            }
        }
        return a;
    }
}