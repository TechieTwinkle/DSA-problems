// Last updated: 04/08/2026, 01:39:00
class Solution {
    public int strStr(String haystack, String needle) {
        int ind = haystack.indexOf(needle);
        if(ind != -1){
            return ind;
        }
        return -1;
    }
}