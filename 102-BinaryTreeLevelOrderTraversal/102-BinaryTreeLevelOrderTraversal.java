// Last updated: 04/08/2026, 01:38:24
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> wrap = new ArrayList<>();
        if(root == null) return wrap;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i = 0; i<n; i++){
                if(q.peek().left != null){
                    q.add(q.peek().left);
                }
                if(q.peek().right != null){
                    q.add(q.peek().right);
                }
                li.add(q.poll().val);
            }
            wrap.add(li);
        }
        return wrap;    
    }
}