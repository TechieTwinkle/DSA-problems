package forGit.MultiDimensionalArrays;
import java.util.*;
public class OutputIn2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int[][] arr = new int[3][4];
        int[][] arr = {{1,2,3},{4,5,6}};
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            for(int j = 0;j< arr[0].length; j++){
//                System.out.print(arr[i][j] + " ");
                arr[i][j] = sc.nextInt()
            }
        }
            System.out.println(sum);

        for(int i =0; i< arr.length; i++){
            for(int j = 0;j< arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
//                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
}
