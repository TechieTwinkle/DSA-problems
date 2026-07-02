package forGit.linkedList;

public class removeDupps {

    public static Node remove(Node head) {

        if (head == null) {
            return null;
        }

        Node temp = head.next;
        Node t = new Node(head.val);
        Node temp2 = t;

        while (temp != null) {

            if (temp.val != t.val) {
                t.next = temp;
                t = temp;
            }

            temp = temp.next;
        }

        t.next = null;

        return temp2;
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Creating the linked list
        // 1 -> 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5

        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        Node ans = remove(head);

        System.out.println("After Removing Duplicates:");
        printList(ans);
    }
}