package forGit.binaryTree;
import java.util.*;

public class isBalanced {
    public static int check(Node root)
    {
        if(root == null) return 0;

        int l = check(root.left);
        int r = check(root.right);

        return Math.max(l,r)+1;
    }
    public static boolean isbal(Node root)
    {
        if(root == null ) return true;
        if(Math.abs(check(root.left) - check(root.right)) <= 1
        && isbal(root.left) && isbal(root.right)) return true;
        else return false;
    }
    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(23);
        root.right = new Node(4);
        root.left.left = new Node(12);
        root.left.right = new Node(6);

        System.out.println(isbal(root));
    }
}
