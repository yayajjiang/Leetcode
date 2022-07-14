class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int sum = 0;
      //int sum = accumulate(nums.begin(), nums.end(), 0);//use iterator to get the accumulation of the vector
        for(auto i : nums)  sum+=i;
        
        int left = 0;
        for(int i = 0; i<nums.size(); i++){
            if(left * 2 == (sum - nums[i])){
                return i;
            }
            
            left+=nums[i];
            
        }
        return -1;
        
    }
};
