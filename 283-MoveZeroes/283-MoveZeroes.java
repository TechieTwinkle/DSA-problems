// Last updated: 04/08/2026, 01:36:58
import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int a=0;
        int b = 0;
        
        while(b<n){
            
            if(nums[b]==0) b++;
            else{
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b++;
            }
        }
     }
}