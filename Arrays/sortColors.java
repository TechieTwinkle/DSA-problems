package forGit.Arrays;
import java.util.*;

public class sortColors {
    public static void swap(int a,int b, int[] nums){
        nums[a] = nums[a]^nums[b];
        nums[b] = nums[a]^nums[b];
        nums[a] = nums[a]^nums[b];
    }
    public static void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        while(b<nums.length){
            if(nums[a] == nums[b]) b++;
            else{
                swap(a,b,nums);
                a++;
                b++;
            }

        }
        Arrays.sort(nums);
    }

    static void main(String[] args) {
        int [] nums = {0,1,3,0,1,3};
        sortColors(nums);
        for(int ele : nums){
            System.out.print(ele + " ");
        }
    }
}
