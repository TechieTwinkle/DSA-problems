package forGit.recurrsion;
import java.util.*;
public class subsequences {
    public static void subsequence(int inx, int [] arr, List<Integer> li){
        if(inx == arr.length){
            System.out.println(li);
            return;
        }

        li.add(arr[inx]);
        subsequence(inx+1,arr,li);

        li.remove(li.size() - 1);
        subsequence(inx+1,arr,li);
    }
    static void main(String[] args) {
        int [] arr ={3,1,2};
        List<Integer> li = new ArrayList<>();
        subsequence(0,arr,li);
    }
}
