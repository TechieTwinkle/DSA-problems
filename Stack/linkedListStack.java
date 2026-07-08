package forGit.Stack;

import java.util.*;

public class linkedListStack {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    // Stack class
    class myStack {
        Node top;
        int size;

        public myStack() {
            // Initialize your data members
            top = null;
            size = 0;
        }

        public boolean isEmpty() {
            // check if the stack is empty
            if (top == null) return true;
            return false;
        }

        public void push(int x) {
            // Adds an element x at the rear of the stack.
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            size = size + 1;
        }

        public void pop() {
            // Removes the front element of the stack.
            if (top == null) return;

            Node temp = top;
            top = top.next;
            size = size - 1;
        }

        public int peek() {
            // Returns the front element of the stack.
            // If stack is empty, return -1.
            if (isEmpty()) return -1;
            return top.data;
        }

        public int size() {
            // Returns the current size of the stack.
            return size;
        }
    }

    public static void main(String[] args) {

        linkedListStack obj = new linkedListStack();
        myStack stack = obj.new myStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.size());

        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println(stack.isEmpty());
    }
}