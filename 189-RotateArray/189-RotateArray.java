// Last updated: 04/08/2026, 01:37:31
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n; // 
        reverse(nums , 0 , n-1); // full reverse

        reverse(nums , 0 , k-1); // first reverse to kth value

        reverse(nums , k ,n-1); // 
    }
    static void reverse(int [] nums,int a,int b){
        while (a<b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}