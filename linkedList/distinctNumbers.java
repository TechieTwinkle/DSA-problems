package forGit.linkedList;

public class distinctNumbers {
    public static Node remove2(Node head) {

        if (head == null) {
            return null;
        }

        Node t = new Node(-1);
        Node temp2 = t;
        Node temp = head;

        while (temp != null) {
            boolean dupp = false;
            while(temp.next !=  null && temp.val == temp.next.val)
            {
                dupp = true;
                temp = temp.next;
            }

            if (!dupp) {
                t.next = temp;
                t = temp;
            }

            temp = temp.next;
        }

        t.next = null;

        return temp2.next;
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


        Node ans2 = remove2(head);
        System.out.println("The Distinct Numbers:");
        printList(ans2);
    }
}
