package forGit.Arrays;

public class peakElement {
    public static int findPeakEle(int [] nums){
        int n = nums.length;
        if(n==1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        int count = 0;
        for(int i = 1; i<n-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                count = i;
            }
        }
        return count;
    }

    static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(findPeakEle(arr));
    }
}
