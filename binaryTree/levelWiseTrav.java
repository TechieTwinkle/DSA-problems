package forGit.binaryTree;
import javax.swing.tree.TreeNode;
import java.util.*;
public class levelWiseTrav {
    class Node
    {
        int val;
        Node left;
        Node right;
        Node(int x)
        {
            this.val = x;
        }
    }
    static List<List<Integer>> orederTrav(Node root){
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> wrap = new ArrayList<>();
        if (root == null) return wrap;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                li.add(q.poll().val);
            }
            wrap.add(li);
        }
        return wrap;
    }

    public static void main(String[] args) {
        levelWiseTrav obj = new levelWiseTrav();

        Node root = obj.new Node(3);
        root.left = obj.new Node(9);
        root.right = obj.new Node(20);
        root.right.left = obj.new Node(15);
        root.right.right = obj.new Node(7);

        // Call function
        List<List<Integer>> result = orederTrav(root);

        // Print result
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
