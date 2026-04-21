package forGit.binaryTree;

public class postOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            this.data = x;
        }
    }
    static void post(Node root)
    {
        if(root == null) return;
        post(root.left);
        post(root.right);
        System.out.print(root.data+"->");
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
        post(root);
    }
}
//6 → 96 → 12 → 69 → 11 → 23 → 92 → 24 → 75 → 1