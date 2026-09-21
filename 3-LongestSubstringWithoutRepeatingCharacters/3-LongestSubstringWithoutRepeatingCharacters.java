// Last updated: 21/09/2026, 17:54:51
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        for(int right = 0; right<s.length(); right++){
            for(int i = left; i<right; i++){
                if(s.charAt(i) == s.charAt(right)) {
                    left = i+1;
                    break;
                }
            }
            int length = right - left + 1;
            if(length > max) max = length;
        }
        return max;
    }
}