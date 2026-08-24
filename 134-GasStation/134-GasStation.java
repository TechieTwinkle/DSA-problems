// Last updated: 24/08/2026, 19:35:07
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int startInd = 0;
        for(int i = 0; i<gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];

        }

        if(totalCost > totalGas) return -1;

        for(int i =0; i<gas.length; i++){
            currentGas += gas[i] - cost[i];

            if(currentGas < 0){
                startInd = i+1;
                currentGas = 0;
            }
        }
        return startInd;
    }
}