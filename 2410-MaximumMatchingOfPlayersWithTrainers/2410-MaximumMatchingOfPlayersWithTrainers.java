// Last updated: 08/09/2026, 21:28:39
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n = players.length;
        int m = trainers.length;

        int l = 0, r = 0;

        while(l<m && r<n){
            if(players[r] <= trainers[l]){
                r++;
            }
            l++;
        }
        return r;
    }
}