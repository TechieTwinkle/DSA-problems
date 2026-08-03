// Last updated: 04/08/2026, 01:37:35
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        for(int i = 1; i<n-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                count = i;
            }
        }
        return count;
    }
}