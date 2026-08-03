// Last updated: 04/08/2026, 01:36:29
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
    int diameter = 0;
    public int check(TreeNode root){
        if(root == null) return 0;

        int l = check(root.left);
        int r = check(root.right);

        diameter = Math.max(diameter , l+r);

        return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        check(root);
        return diameter;
    }
}