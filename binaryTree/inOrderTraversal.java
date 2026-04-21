package forGit.binaryTree;

public class inOrderTraversal
{
    static void inOrder(Node root)
    {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);
    }

    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(23);
        root.right = new Node(75);
        root.left.left = new Node(12);
        root.left.right = new Node(11);
        root.right.left = new Node(92);
        root.right.right = new Node(24);
        root.left.left.left = new Node(6);
        root.left.left.right = new Node(96);
        root.left.right.left = new Node(69);
        inOrder(root);
    }
}
// 6 → 12 → 96 → 23 → 69 → 11 → 1 → 92 → 75 → 24