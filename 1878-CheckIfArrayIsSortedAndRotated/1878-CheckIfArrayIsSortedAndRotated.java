// Last updated: 04/08/2026, 01:35:56
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
}