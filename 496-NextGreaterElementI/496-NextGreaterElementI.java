// Last updated: 04/08/2026, 01:36:43
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j<nums2.length; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    int k;    
                  for (k = j + 1; k < nums2.length; k++)
                  {
                        if (nums2[k] > nums2[j])
                        {
                            li.add(nums2[k]); 
                            break;
                        } 
                    }
                    if(k == nums2.length)
                    {
                        li.add(-1);
                    }
                    break;
                }
            }
        }
        int[] ans = new int[li.size()];
        for (int i = 0; i < li.size(); i++) 
        {
            ans[i] = li.get(i);
        }

        return ans;
    }
}