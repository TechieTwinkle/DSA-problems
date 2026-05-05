package forGit.binaryTree;

public class isSameTree {
    public static boolean isSame(Node root1 , Node root2){

        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;

        return (root1.data == root2.data) && isSame(root1.left , root2.left) && isSame(root1.right,root2.right);
    }

    static void main(String[] args) {
        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);

        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);
        t2.left.left = new Node(7);

        System.out.println(isSame(t1, t2));
    }
}
