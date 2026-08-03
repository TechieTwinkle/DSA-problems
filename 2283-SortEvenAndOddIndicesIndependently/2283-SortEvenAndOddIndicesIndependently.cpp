// Last updated: 04/08/2026, 01:35:51
class Solution {
public:
    vector<int> sortEvenOdd(vector<int>& nums) {
        vector<int> even, odd;    
        for (int i = 0; i < nums.size(); ++i) {
            if (i % 2 == 0)
                even.push_back(nums[i]);
            else
                odd.push_back(nums[i]);
        }
        for (int i = 0; i < even.size(); ++i) {
            for (int j = i + 1; j < even.size(); ++j) {
                if (even[i] > even[j])
                    swap(even[i], even[j]);
            }
        }
        for (int i = 0; i < odd.size(); ++i) {
            for (int j = i + 1; j < odd.size(); ++j) {
                if (odd[i] < odd[j])
                    swap(odd[i], odd[j]);
            }
        }
        int eveni = 0, oddi = 0;
        for (int i = 0; i < nums.size(); ++i) {
            if (i % 2 == 0)
                nums[i] = even[eveni++];
            else
                nums[i] = odd[oddi++];
        }
        return nums;
    }
};