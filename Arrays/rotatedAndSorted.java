package forGit.Arrays;

public class rotatedAndSorted {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
    static void main() {
        int [] nums = {2,1,3,4};
        System.out.println(check(nums));

    }
}
