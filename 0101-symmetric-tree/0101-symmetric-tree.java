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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int currentSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i =0; i<currentSize;i++){
                TreeNode currentNode = queue.poll();
                if(currentNode!=null){
                    currentLevel.add(currentNode.val);
                    queue.offer(currentNode.left);
                    queue.offer(currentNode.right);
                }else{
                    currentLevel.add(null);
                }
            }
            if(!isPalin(currentLevel)){
                return false;
            }
        }
        return true;
    }
    private boolean isPalin(List<Integer> list){
        int left=0;
        int right = list.size()-1;
        while(left<right){
            if(list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}