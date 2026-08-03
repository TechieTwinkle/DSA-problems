// Last updated: 04/08/2026, 01:36:44
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int j = 0;
        for(int i = 0 ; i<arr2.length && j< arr1.length; i++){
            if(arr2[i] == arr1[j]) {
                j++;
            }
        }
        return j == arr1.length;
    }
}