// Last updated: 24/08/2026, 19:34:02
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] locations = new int[1001];

        for(int i = 0; i<trips.length; i++){
            int passengers = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];

            locations[from] += passengers;
            locations[to] -= passengers;
        }
        int curr = 0;
        for(int i = 0; i<locations.length; i++){
            curr += locations[i];
            if(curr > capacity) return false;
        }
        return true;
    }
}