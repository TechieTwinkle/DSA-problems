package forGit.binaryTree;

public class diameter {
    public static int diam = 0;
    public static int maxDepth(Node root){

        if(root == null) return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        diam = Math.max(diam,l+r);

        return Math.max(l,r) +1;
    }
    public static int diameterOfTree(Node root){
        maxDepth(root);
        return diam;
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

        System.out.println(diameterOfTree(root));
    }
}
