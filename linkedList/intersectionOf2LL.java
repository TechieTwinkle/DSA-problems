package forGit.linkedList;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class intersectionOf2LL {

    public static ListNode intersection(ListNode hA, ListNode hB) {
        ListNode p1 = hA;
        ListNode p2 = hB;

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

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);
        common.next.next = new ListNode(12);

        // List A: 3 -> 6 -> 9 -> 8 -> 10 -> 12
        ListNode headA = new ListNode(3);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(9);
        headA.next.next.next = common;

        // List B: 4 -> 8 -> 10 -> 12
        ListNode headB = new ListNode(4);
        headB.next = common;

        System.out.println("List A:");
        printList(headA);

        System.out.println("List B:");
        printList(headB);

        ListNode ans = intersection(headA, headB);

        if (ans != null) {
            System.out.println("Intersection Node = " + ans.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}