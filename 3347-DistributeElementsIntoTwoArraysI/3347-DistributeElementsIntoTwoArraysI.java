// Last updated: 20/08/2026, 19:15:11
class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>();

        li1.add(nums[0]);
        li2.add(nums[1]);

        for(int i = 2;i<nums.length;i++){
           int last1 = li1.get(li1.size() - 1);
           int last2 = li2.get(li2.size() - 1);

           if(last1 > last2) li1.add(nums[i]);
           else li2.add(nums[i]);
        } 
        int[] ans = new int[nums.length];
        int ind = 0;
        for(int i = 0; i<li1.size(); i++){
            ans[ind] = li1.get(i);
            ind++;
        }
        for(int i = 0; i<li2.size(); i++){
            ans[ind] = li2.get(i);
            ind++;
        }
        return ans;
    }
}