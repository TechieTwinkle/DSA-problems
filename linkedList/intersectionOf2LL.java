package forGit.linkedList;

public class intersectionOf2LL {

    public static Node intersection(Node hA, Node hB) {
        Node p1 = hA;
        Node p2 = hB;

        while (p1 != p2) {

            if (p1 == null) {
                p1 = hB;
            } else {
                p1 = p1.next;
            }

            if (p2 == null) {
                p2 = hA;
            } else {
                p2 = p2.next;
            }
        }

        return p1;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Common part
        Node common = new Node(8);
        common.next = new Node(10);
        common.next.next = new Node(12);

        // List A: 3 -> 6 -> 9 -> 8 -> 10 -> 12
        Node headA = new Node(3);
        headA.next = new Node(6);
        headA.next.next = new Node(9);
        headA.next.next.next = common;

        // List B: 4 -> 8 -> 10 -> 12
        Node headB = new Node(4);
        headB.next = common;

        System.out.println("List A:");
        printList(headA);

        System.out.println("List B:");
        printList(headB);

        Node ans = intersection(headA, headB);

        if (ans != null) {
            System.out.println("Intersection Node = " + ans.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}