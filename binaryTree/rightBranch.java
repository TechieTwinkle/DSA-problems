package forGit.binaryTree;
import java.util.*;
public class rightBranch {

    public static List<Integer> li = new LinkedList<>();
    public static List<Integer> rightSideView(Node root) {
        preorderTraversal(root , 0);
        return li;
    }
    public static void preorderTraversal(Node root , int l) {
        if(root == null) return;
        if(l == li.size()){
            li.add(root.data);
        }
        preorderTraversal(root.right , l+1);
        preorderTraversal(root.left , l+1);
    }

    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
//        root.left.left = new Node(12);
        root.left.right = new Node(5);
//        root.right.left = new Node(92);
        root.right.right = new Node(4);
//        root.left.left.left = new Node(6);
//        root.left.left.right = new Node(96);
//        root.left.right.left = new Node(69);
        System.out.println(rightSideView(root));
    }
}
