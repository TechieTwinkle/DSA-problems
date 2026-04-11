package forGit.linkedList;

public class merge2sortedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode head = new ListNode(-1);
        ListNode temp = head;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                temp.next = new ListNode(temp1.val);
                temp1 = temp1.next;
            } else {
                temp.next = new ListNode(temp2.val);
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if (temp1 != null) temp.next = temp1;
        else temp.next = temp2;

        return head.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));

        ListNode list2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(6)));

        ListNode result = merge(list1, list2);

        printList(result);
    }
}