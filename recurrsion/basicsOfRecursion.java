package forGit.recurrsion;
import java.util.*;
public class basicsOfRecursion {

//print from N to 1 and N times;

//    public static void printNtimes(int i, int n){
//        if(i<1) return;
//        System.out.println(i + " Joy");
//        printNtimes(i-1,n);
//    }
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printNtimes(n,n);
//    }



// print N times and from 0 tp N;
//    public static void printNtimes(int i, int n){
//        if(i>n) return;
//        System.out.println(i + " Joy");
//        printNtimes(i+1,n);
//    }
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printNtimes(0,n);
//    }


//from backtracking
//    public static void printNtimes(int i, int n){
//        if(i<1) return;
//        printNtimes(i-1,n);
//        System.out.println(i + " Joy");
//
//    }
//
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printNtimes(n,n);
//    }


// Print sum of N numbers (Parameterised)
//    public static void printNtimes(int i, int sum){
//        if(i<1) {
//            System.out.println(sum);
//            return;
//        }
//        printNtimes(i-1,sum+i);
//        System.out.println(i + " Joy");
//
//    }
//
//    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        printNtimes(n,0);
//    }


//Print sum of N numbers (Functional)
    public static int printNtimes(int n){
        if(n==0) {
            return 1;
        }
        return n * printNtimes(n-1);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNtimes(n));
    }
}