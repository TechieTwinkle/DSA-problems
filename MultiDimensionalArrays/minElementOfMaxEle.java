package forGit.MultiDimensionalArrays;
import java.util.*;
public class minElementOfMaxEle {
    public static int minEle(int[][] arr){
        List<Integer> li = new ArrayList<>();
        for(int i =0; i< arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<arr[0].length; j++){
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            li.add(max);
        }
        return Collections.min(li);
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(minEle(arr));
    }
}
