package forGit.Heap;
import java.util.*;

public class kLargest {

    // Your original function
    public static void fun(int arr[], int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : arr) pq.add(ele);

        while(k > 0) {
            System.out.print(pq.poll());
            if(k != 1) System.out.print(" ");
            k--;
        }
    }

    // The main method to execute the program
    public static void main(String[] args) {
        // 1. Define a sample array
        int[] arr = {1, 23, 12, 9, 30, 2, 50};

        // 2. Define the number of elements (n) and the number of largest elements to find (k)
        int n = arr.length;
        int k = 3;

        // 3. Print a helpful message
        System.out.print("The " + k + " largest elements are: ");

        // 4. Call your function
        fun(arr, n, k);

        // Expected Output: 50 30 23
    }
}      