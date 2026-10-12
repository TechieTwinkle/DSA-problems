// Last updated: 12/10/2026, 16:55:49
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void func(int ind, int[] arr, int target, List<Integer> li){
        if(target == 0){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i = ind ; i<arr.length; i++){

            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            li.add(arr[i]);
            func(i + 1 , arr, target - arr[i], li);
            li.remove(li.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> li = new ArrayList<>();
        Arrays.sort(candidates);
        func(0,candidates,target,li);
        return ans;
    }
}