class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i]=nums[i] + nums[i-1];
        }
        return nums;
    }
}


//c++, vector.size()
// class Solution {
// public:
//     vector<int> runningSum(vector<int> &nums) {
//         for (int i = 1; i < nums.size(); i++) {
//             nums[i] += nums[i - 1];
//         }
//         return nums;
//     }
// };

//python
// class Solution:
//     def runningSum(self, nums: List[int]) -> List[int]:
//         for i in range(1, len(nums)):
//             nums[i] += nums[i - 1]
//         return nums
