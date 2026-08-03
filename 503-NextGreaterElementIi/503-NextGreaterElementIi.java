// Last updated: 04/08/2026, 01:36:41
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i<nums.length; i++)
        {
            int j = (i+1) % nums.length;
            while(i!=j)
            {
                if(nums[i] < nums[j]){
                    li.add(nums[j]);
                    break;
                }
                j = (j+1) % nums.length;
            }
            if(i == j) li.add(-1);
        }
        
        int[] ans = new int[li.size()];
        for (int k = 0; k < li.size(); k++) {
            ans[k] = li.get(k);
        }

        return ans;
    }
}