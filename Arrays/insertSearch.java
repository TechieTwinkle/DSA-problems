package forGit.Arrays;

public class insertSearch {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int [] arr = {1};
        int target = 0;
        System.out.println(searchInsert(arr,target));

    }
}
