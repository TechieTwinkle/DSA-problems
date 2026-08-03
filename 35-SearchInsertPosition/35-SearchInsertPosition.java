// Last updated: 04/08/2026, 01:38:55
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return n;
    }
}