package forGit.Arrays;

import java.util.*;

public class nextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {

                    int k;
                    for (k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            li.add(nums2[k]);
                            break;
                        }
                    }

                    if (k == nums2.length) {
                        li.add(-1);
                    }

                    break;
                }
            }
        }

        int[] ans = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            ans[i] = li.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        nextGreaterElement obj = new nextGreaterElement();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] ans = obj.nextGreaterElement(nums1, nums2);

        System.out.print("Output: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}