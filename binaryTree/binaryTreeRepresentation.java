package forGit.binaryTree;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int x)
    {
        this.data = x;
    }
}
public class binaryTreeRepresentation {
        static void main(String[] args){
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
        }
}
