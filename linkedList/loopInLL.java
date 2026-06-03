package forGit.linkedList;

import linkedlist.deleteData;
import org.w3c.dom.Node;

public class loopInLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }


//    public static int loopInList(Node head) {
//        // Write your code here
//        Node slow = head;
//        Node fast = head;
//        int count = 0;
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast){
//                count = 1;
//                slow = slow.next;
//                while(slow != fast){
//                    count++;
//                    slow = slow.next;
//                }
//                return count;
//            }
//        }
//        return 0;
//    }
    public static int middle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    static void main(String[] args) {
        Node head = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);

        head.next = a;
        a.next = b;
        b.next = c;

        // creating loop
//        c.next = a;

//        int ans = loopInList(head);
        int mid = middle(head);
        System.out.println("Mid = " + mid);
    }
}
