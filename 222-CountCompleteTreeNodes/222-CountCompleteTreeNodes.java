// Last updated: 04/08/2026, 01:37:18
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
    int cnt = 0;
    public void check(TreeNode root)
    {
        if(root == null) return;
        check(root.left);
        cnt++;
        check(root.right);

    }
    public int countNodes(TreeNode root) {
        
        check(root);
        return cnt;

    }
}