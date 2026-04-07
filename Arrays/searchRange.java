package forGit.Arrays;
import java.util.*;

public class searchRange {
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1;
        int last = -1;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                if(first == -1) first = i;
                last = i;
            }
        }
        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,7,8,8};
        int target = 7;
        int[] res = searchRange(arr,target);
        for(int ele : res){
            System.out.println(ele + " ");
        }
//        System.out.println(searchRange(arr,target));

    }
}