// Last updated: 04/08/2026, 01:38:41
import java.util.*;
class Solution {
    public static void swap(int a,int b, int[] nums){
        nums[a] = nums[a]^nums[b];
        nums[b] = nums[a]^nums[b];
        nums[a] = nums[a]^nums[b];
    }
    public void sortColors(int[] nums) {
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
}