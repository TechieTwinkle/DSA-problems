// Last updated: 04/08/2026, 01:38:44
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.trim().split(" ");
        int n = arr.length;
        char[] last = arr[n-1].toCharArray();
        return last.length; 
    }
}