// Last updated: 13/10/2026, 18:23:04
class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i<=n-1; i++){
            if(n % (i+1) == 0){
                ans += (nums[i] * nums[i]);
            }
        }
        return ans;
    }
}