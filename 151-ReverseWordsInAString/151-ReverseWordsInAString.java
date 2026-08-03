// Last updated: 04/08/2026, 01:37:46
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] arr = s.split("\\s+");
        int i = 0;
        int j = arr.length -1;
        while(i<j){
            String st = arr[i];
            arr[i] = arr[j];
            arr[j] = st;
            i++;
            j--;
        }
        return String.join(" ",arr);
    }
}