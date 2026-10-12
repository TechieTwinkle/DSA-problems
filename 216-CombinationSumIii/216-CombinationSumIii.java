// Last updated: 12/10/2026, 19:21:29
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void func(int ind, int k, int n, List<Integer> li ){
       if(li.size() == k){ 
            if(n == 0){
                ans.add(new ArrayList<>(li));
                return;
            }
        }
        for(int i = ind ; i <= 9; i++){
            if (i > n) {
                break;
            }
            li.add(i);
            func(i+1, k,n - i, li);
            li.remove(li.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> li = new ArrayList<>();
        func(1,k,n,li);
        return ans;
    }
}