package forGit.Queues;

import java.util.*;

public class queueArrays {

    static int SIZE = 100;
    static int front = -1;
    static int rear = -1;
    static int array[] = new int[SIZE];

    // Constructor
    public queueArrays() {
        front = rear = -1;
    }

    void enqueue(int item) {
        if (rear == SIZE - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        array[++rear] = item;
    }

    int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int item = array[front++];

        if (front > rear) {
            front = rear = -1;
        }

        return item;
    }

    int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return array[front];
    }

    boolean isEmpty() {
        return (front == -1 || front > rear);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        queueArrays q = new queueArrays();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        q.display();

        System.out.println("Front Element: " + q.peek());

        System.out.println("Is Empty: " + q.isEmpty());
    }
}