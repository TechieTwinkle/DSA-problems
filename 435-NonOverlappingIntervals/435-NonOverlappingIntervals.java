// Last updated: 20/08/2026, 19:15:44
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[1]-b[1]);
        int cnt = 0;
        ArrayList<Integer> li = new ArrayList<>();

        li.add(intervals[0][1]);
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < li.get(li.size() - 1)){
                cnt++;
            }
            else{
                li.add(intervals[i][1]);
            }
        }
        return cnt;
    }
}