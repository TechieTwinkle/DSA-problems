// Last updated: 21/09/2026, 18:31:42
class Solution {
    public static void subsequence(int inx, int [] arr, List<Integer> li, List<List<Integer>> ans){
        if(inx == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        li.add(arr[inx]);
        subsequence(inx+1,arr,li,ans);

        li.remove(li.size() - 1);

        int next = inx+1;
        while (next < arr.length && arr[next] == arr[inx]) {
            next++;
        }

        subsequence(next, arr, li, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> li = new ArrayList<>();

        subsequence(0, nums, li, ans);

        return ans;
    }
}