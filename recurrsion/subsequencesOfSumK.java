package forGit.recurrsion;
import java.util.*;
public class subsequencesOfSumK {
    public static void subOfSum(int inx,int s, int []arr, int sum, List<Integer> li){
        if(inx == arr.length){
            if(s==sum){
                System.out.println(li);
            }
            return;
        }
        li.add(arr[inx]);
        s+=arr[inx];
        subOfSum(inx+1,s,arr,sum,li);
        li.remove(li.size() - 1);
        s-=arr[inx];
        subOfSum(inx+1,s,arr,sum,li);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int sum = 2;
        List<Integer> li = new ArrayList<>();
        subOfSum(0,0,arr,sum,li);
        System.out.println(li);
    }
}
