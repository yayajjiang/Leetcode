#include <iostream>
#include <vector>
#include <algorithm>
 
class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        int count = 0;
        for(int i = 0; i < nums.size()-2; i++){
            if(find(nums.begin(), nums.end(), (nums[i]+diff))!=nums.end()  && find(nums.begin(), nums.end(),nums[i]+2*diff)!=nums.end() ){
                count++;
            }
        }
        return count;
    }
    
};
