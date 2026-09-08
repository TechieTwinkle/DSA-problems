// Last updated: 08/09/2026, 21:29:05
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int  c = 0;
        int s = 0;
        for(int i = cost.length - 1; i>=0; i--){
            c++;
            if(c%3 != 0){
                s += cost[i];
            }
        }
        return s;
    }
}