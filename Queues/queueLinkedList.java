package forGit.Queues;

public class queueLinkedList {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    // Queue class
    class myQueue {
        Node start;
        Node end;
        int size;

        public myQueue() {
            // Initialize your data members
            start = null;
            end = null;
            size = 0;
        }

        public boolean isEmpty() {
            // check if the queue is empty
            if (start == null)
                return true;
            return false;
        }

        public void enqueue(int x) {
            // Adds an element x at the rear of the queue.
            Node temp = new Node(x);

            if (start == null) {
                start = end = temp;
            } else {
                end.next = temp;
                end = temp;
            }

            size++;
        }

        public void dequeue() {
            // Removes the front element of the queue
            if (start == null) {
                return;
            }

            Node temp = start;
            start = start.next;

            if (start == null) {
                end = null;
            }

            size--;
        }

        public int getFront() {
            // Returns the front element of the queue.
            // If queue is empty, return -1.
            if (start == null) {
                return -1;
            }

            return start.data;
        }

        public int size() {
            // Returns the current size of the queue.
            return size;
        }
    }

    public static void main(String[] args) {

        queueLinkedList obj = new queueLinkedList();
        myQueue q = obj.new myQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front: " + q.getFront()); // 10
        System.out.println("Size: " + q.size());      // 3

        q.dequeue();

        System.out.println("Front: " + q.getFront()); // 20
        System.out.println("Size: " + q.size());      // 2

        q.dequeue();
        q.dequeue();

        System.out.println("Is Empty: " + q.isEmpty()); // true
    }
}