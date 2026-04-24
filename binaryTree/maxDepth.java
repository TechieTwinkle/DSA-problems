package forGit.binaryTree;

public class maxDepth {
//    static class Node
//    {
//        int val;
//        Node left;
//        Node right;
//        Node(int x)
//        {
//            this.val = x;
//        }
//    }
    public static int maxDep(Node root){
        if(root == null) return 0;
        int l = maxDep(root.left);
        int r = maxDep(root.right);

        return Math.max(l+1,r+1);

    }

    public static void main(String[] args) {
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
        System.out.println("MAX DEPTH: " + maxDep(root));
    }
}
