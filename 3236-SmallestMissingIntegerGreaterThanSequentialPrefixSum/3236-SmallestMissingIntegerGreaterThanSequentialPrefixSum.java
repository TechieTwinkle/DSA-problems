// Last updated: 11/08/2026, 15:02:10
import java.util.*;
class Solution {
    public int missingInteger(int[] nums) {
        int x = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1] + 1){
                x+=nums[i];
            }else{
                break;
            }
        }
        HashSet set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        while(set.contains(x)){
            x++;
        } 
        return x;
    }
}