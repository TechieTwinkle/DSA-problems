// Last updated: 25/08/2026, 19:14:08
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int totalGas = 0;
4        int totalCost = 0;
5        int currentGas = 0;
6        int startInd = 0;
7        for(int i = 0; i<gas.length; i++){
8            totalGas += gas[i];
9            totalCost += cost[i];
10
11        }
12
13        if(totalCost > totalGas) return -1;
14
15        for(int i =0; i<gas.length; i++){
16            currentGas += gas[i] - cost[i];
17
18            if(currentGas < 0){
19                startInd = i+1;
20                currentGas = 0;
21            }
22        }
23        return startInd;
24    }
25}