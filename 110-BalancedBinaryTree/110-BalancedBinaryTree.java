// Last updated: 04/08/2026, 01:38:12
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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(Math.abs(check(root.left) - check(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right))
        {
            return true;
        }
        else return false;
    }
    public int check(TreeNode root)
    {
        if(root == null) return 0;

        int l = check(root.left);
        int r = check(root.right);

        return Math.max(l,r)+1;
    }
}