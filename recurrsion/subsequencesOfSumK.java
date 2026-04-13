package forGit.recurrsion;
import java.util.*;
public class subsequencesOfSumK {
    public static int subOfSum(int inx,int s, int []arr, int sum, List<Integer> li){
        if(inx == arr.length){
            if(s==sum){
                System.out.println(li);
                return 1;
            }
            return 0;
        }

        //picking elements
        li.add(arr[inx]);
        s+=arr[inx];
        int left = subOfSum(inx+1,s,arr,sum,li);

        //backtracking vapis
        li.remove(li.size() - 1);
        s-=arr[inx];

        // not picked
        int right = subOfSum(inx+1,s,arr,sum,li);

        return left+right;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int sum = 2;
        List<Integer> li = new ArrayList<>();
        int cnt = subOfSum(0,0,arr,sum,li);
        System.out.println(cnt);
    }
}
