// Last updated: 04/08/2026, 01:37:23
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
    List<Integer> li = new LinkedList<>();
    public List<Integer> rightSideView(TreeNode root) {
        preorderTraversal(root , 0);
        return li; 
    }
    public void preorderTraversal(TreeNode root , int l) {
        if(root == null) return;
        if(l == li.size()){
            li.add(root.val);
        }
        preorderTraversal(root.right , l+1);
        preorderTraversal(root.left , l+1);      
    }
}