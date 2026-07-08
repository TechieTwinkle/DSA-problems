package forGit.Stack;

import java.util.*;

public class queueStack {

    class MyStack {

        Queue<Integer> q = new LinkedList<>();

        public MyStack() {
        }

        public void push(int x) {
            int s = q.size();
            q.add(x);

            for (int i = 0; i < s; i++) {
                q.add(q.peek());
                q.poll();
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {

        queueStack outer = new queueStack();
        MyStack stack = outer.new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top());     // 30
        System.out.println("Pop: " + stack.pop());     // 30
        System.out.println("Top: " + stack.top());     // 20
        System.out.println("Empty: " + stack.empty()); // false

        stack.pop();
        stack.pop();

        System.out.println("Empty: " + stack.empty()); // true
    }
} 