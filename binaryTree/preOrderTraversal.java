package forGit.binaryTree;

public class preOrderTraversal {

    static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data + "->");
        preOrder(root.left);
        preOrder(root.right);
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
        preOrder(root);
    }
}
// 1 → 23 → 12 → 6 → 96 → 11 → 69 → 75 → 92 → 24


// list.addAll isliye kiya kyunki tum list function ke andr bna rhe ho aur
//agar list globally define karoge toh list.addall nhi karna padega
//
//class Solution {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> li = new ArrayList<>();
//        if(root == null) return li;
//        li.add(root.val);
//        li.addAll(preorderTraversal(root.left));
//        li.addAll(preorderTraversal(root.right));
//        return li;
//    }
//}