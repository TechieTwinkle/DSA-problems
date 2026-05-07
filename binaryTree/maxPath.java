package forGit.binaryTree;

public class maxPath {
    static int maxi = Integer.MIN_VALUE;
    public static int check(Node root){
        if(root == null) return 0;
        int l = Math.max(0,check(root.left));
        int r = Math.max(0,check(root.right));
        maxi = Math.max(maxi,l+r+root.data);
        return Math.max(l,r) + root.data;
    }
    public static int maxPathSum(Node root) {
        check(root);
        return maxi;
    }

    static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println(maxPathSum(root));
    }
}
