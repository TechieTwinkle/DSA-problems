package forGit.Stack;

import java.util.*;

public class StackArray {
    int size;
    int top;
    int [] arr;
// Constructor
    StackArray(int n){
        size = n;
        top = -1;
        arr = new int[n];
    }
//    if st is full
    public boolean isFull(){
        return top == size-1;
    }
//    if st is empty
    public boolean isEmpty() {
        return top == -1;
    }
//    we have to see top element
    public int peek(){
        return arr[top];
    }
//    to add an element in st
    public void push(int x){
        if(isFull()) return;
        arr[++top] = x;
    }
//    to remove an element from st
    public int pop(){
        if(isEmpty()) return -1;
        return arr[top--];
    }
//    to check size of st
    public int getSize(){
        return size-1;
    }

    public static void main(String[] args) {
        // stacks follows LIFO principle
        int n = 5;
        StackArray st = new StackArray(n);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.getSize());
        System.out.println(st.isEmpty());

        for(int i = 0; i < n; i++)
        {
            System.out.print(st.pop());
        }

    }
}