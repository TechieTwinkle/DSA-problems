// Last updated: 04/08/2026, 01:38:09
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int ele:prices)
        {
            if(min>ele)min = ele;
            else max = Math.max(max,ele-min);
        }
        return max;
    }
}