// Last updated: 12/10/2026, 14:51:45
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void comb(int ind, int[] arr, int target ,List<Integer> ds){
        if(ind >= arr.length){
            if(target == 0){
                ans.add(new ArrayList(ds));
            }
            return;
        }
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            comb(ind , arr, target-arr[ind] , ds);
            ds.remove(ds.size()-1);
        }
        comb(ind+1, arr, target, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<>();
        comb(0,candidates,target,ds);
        return ans;
    }
}