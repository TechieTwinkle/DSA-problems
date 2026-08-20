// Last updated: 20/08/2026, 19:15:07
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