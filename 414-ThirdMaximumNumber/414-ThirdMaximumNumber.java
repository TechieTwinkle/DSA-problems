// Last updated: 13/08/2026, 20:28:23
class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long maxS = Long.MIN_VALUE;
        long maxT = Long.MIN_VALUE;

        for(int i =0; i<nums.length; i++){
            if(max < nums[i]){
                maxT = maxS;
                maxS = max;
                max = nums[i];
            }
            if(maxS < nums[i] && max != nums[i]){
                maxT = maxS;
                maxS = nums[i];
            }
            if(maxT < nums[i] && max != nums[i] && maxS != nums[i]){
                maxT = nums[i];
            }
        }
        if(maxT == Long.MIN_VALUE) {
            return (int)max;
        }
        return (int)maxT;
    }
}