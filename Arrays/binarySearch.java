package forGit.Arrays;

public class binarySearch {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high-low) /2; // used safe overflow condition
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};
        int target = -1;
        System.out.println(search(arr,target));

    }
}
