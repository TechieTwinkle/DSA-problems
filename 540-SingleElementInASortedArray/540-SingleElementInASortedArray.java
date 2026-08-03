// Last updated: 04/08/2026, 01:36:33
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor = 0;
        for(int ele:nums)
        {
            xor = xor ^ ele;
        }
        return xor;
    }
}