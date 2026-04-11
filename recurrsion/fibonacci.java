package forGit.recurrsion;

import java.util.*;

public class fibonacci {
    public static int fibonacciNumber(int n ){
        if(n<=1) return n;
        int fib = fibonacciNumber(n-1);
        int fib2 = fibonacciNumber(n-2);
//        int fibb = fib + fib2;
//        return fibb;
        return fib + fib2;
    }

    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 4;
        System.out.println("enter number: " + n);
        System.out.println("fibonacci number is: " + fibonacciNumber(n));

    }
}

