/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        Helper(root,arr);
        return arr;
    }
    static void Helper(TreeNode root,List<Integer> arr  ){
        if(root==null){
            return;
        }
        arr.add(root.val);
        Helper(root.left,arr);
        Helper(root.right,arr);
    }
}