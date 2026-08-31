// Last updated: 31/08/2026, 19:26:41
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minInd = 0;
        int maxInd = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                maxInd = i;
            }
            if(min > nums[i]){
                min = nums[i];
                minInd = i;
            }
        }
        int left = Math.max(maxInd , minInd) + 1;
        int right = n - Math.min(maxInd , minInd);
        int both = (Math.min(maxInd , minInd) + 1) + 
                   (n - Math.max(maxInd , minInd));
        
        int ans = Math.min(left,Math.min(right,both));

        return ans;
    }
}