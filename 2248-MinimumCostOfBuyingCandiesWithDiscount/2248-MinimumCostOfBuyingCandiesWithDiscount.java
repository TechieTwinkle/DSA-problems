// Last updated: 20/08/2026, 19:15:10
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int  cnt = 0;
        int sum = 0;
        for(int i = cost.length - 1; i>=0; i--){
            cnt++;
            if(cnt%3 != 0){
                sum += cost[i];
            }
        }
        return sum;
    }
}