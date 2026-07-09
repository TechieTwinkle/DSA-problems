package forGit.Queues;

import java.util.Stack;

public class stackqueue {

    class MyQueue {
        Stack<Integer> s1, s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int pop() {
            if (s1.isEmpty())
                return -1;
            return s1.pop();
        }

        public int peek() {
            if (s1.isEmpty())
                return -1;
            return s1.peek();
        }

        public boolean empty() {
            if (s1.isEmpty())
                return true;
            return false;
        }
    }

    public static void main(String[] args) {

        stackqueue obj = new stackqueue();
        MyQueue q = obj.new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front: " + q.peek());    // 10
        System.out.println("Pop: " + q.pop());       // 10
        System.out.println("Front: " + q.peek());    // 20
        System.out.println("Empty: " + q.empty());   // false

        q.pop();
        q.pop();

        System.out.println("Empty: " + q.empty());   // true
    }
}