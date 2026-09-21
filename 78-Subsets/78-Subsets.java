// Last updated: 21/09/2026, 18:31:51
class Solution {
    public static void subsequence(int inx, int [] arr, List<Integer> li, List<List<Integer>> ans){
        if(inx == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        li.add(arr[inx]);
        subsequence(inx+1,arr,li,ans);

        li.remove(li.size() - 1);
        subsequence(inx+1,arr,li,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        subsequence(0, nums, li, ans);

        return ans;
    }
}