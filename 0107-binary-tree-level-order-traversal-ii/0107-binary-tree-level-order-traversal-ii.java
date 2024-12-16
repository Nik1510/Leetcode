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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int currentLevel = deque.size();
            List<Integer> current = new ArrayList<>(currentLevel);
            for(int i =0; i<currentLevel;i++){
                TreeNode currentNode = deque.poll();
                current.add(currentNode.val);
                if(currentNode.left!=null){
                    deque.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    deque.offer(currentNode.right);
                }
            }
            result.add(0,current);
        }
        return result;
    }
}