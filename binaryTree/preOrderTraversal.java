package forGit.binaryTree;

public class preOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int x){
            this.data = x;
        }
    }
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        preOrder(root);
        System.out.println();


    }
}
