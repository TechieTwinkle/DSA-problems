package forGit.MultiDimensionalArrays;
import java.util.*;
public class OutputIn2DArray {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
////        int[][] arr = new int[3][4];
//        int[][] arr = {{1,2,3},{4,5,6}};
//        int sum = 0;
//        for(int i =0; i< arr.length; i++){
//            for(int j = 0;j< arr[0].length; j++){
////                System.out.print(arr[i][j] + " ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//            System.out.println(sum);
//
//        for(int i =0; i< arr.length; i++){
//            for(int j = 0;j< arr[0].length; j++){
//                System.out.print(arr[i][j] + " ");
////                arr[i][j] = sc.nextInt();
//            }
//            System.out.println();

//        int[][] arr = {{1,2,3},{4,5,6}};
//        for(int j=0; j<arr[0].length;j++){
//            for(int i= 0; i< arr.length; i++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        for(int[] a : arr){
//            for(int ele : a){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        for(int i = 0; i<arr.length; i++){
//            for(int j = 0; j<arr[0].length; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
        int[][] arr = {
                {2,4},
                {1,3}
        };
        for(int i=0; i<arr[0].length; i++){
            for(int j =arr.length -1; j>=0; j--){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
//        for(int i = arr.length -1;i>=0; i--){
//            for(int j = arr[0].length-1; j>=0; j--){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
