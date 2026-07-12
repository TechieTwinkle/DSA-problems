package forGit.MultiDimensionalArrays;
import java.util.*;
public class rowWithMaxSum {

    public static int maxSum(int[][] arr){
        int mSum = Integer.MIN_VALUE;
        int row = -1;
        for(int i=0; i<arr.length; i++){
            int sum =0;
            for(int j = 0; j<arr[0].length; j++){
                sum = sum+arr[i][j];
            }
//            mSum = Math.max(sum,mSum);
            if(sum > mSum){
                mSum = sum;
                row = i;
            }
        }
        return row;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6}};
//        maxSum(arr);
        System.out.println("Row with MAx Sum: " + maxSum(arr));

    }
}
