package forGit.Arrays;

import java.util.ArrayList;
import java.util.List;

public class nextGreaterII {
    public static int[] nextGreaterElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            int j = (i+1) %nums.length;
            while(i != j){
                if(nums[i] <nums[j]){
                    li.add(nums[j]);
                    break;
                }
                j = (j+1)% nums.length;
            }
            if(i == j) li.add(-1);
        }
        int[] ans = new int[li.size()];
        for (int k = 0; k < li.size(); k++) {
            ans[k] = li.get(k);
        }

        return ans;
    }
    public static void main(String[] args) {

        nextGreaterII obj = new nextGreaterII();

        int[] nums1 = {4, 1, 2};

        int[] ans = obj.nextGreaterElements(nums1);
        System.out.print("Output: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
