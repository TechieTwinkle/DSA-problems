package forGit.Queues;

import java.util.*;

public class reverseQueue {

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int x = 0;

        while (x != -1) {
            x = q.poll();
            if (x == -1)
                break;
            st.push(x);
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(-1);   // Sentinel value

        System.out.println("Original Queue: " + q);

        reverse(q);

        System.out.println("Reversed Queue: " + q);
    }
}