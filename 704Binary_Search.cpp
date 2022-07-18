class Solution {
public:
    int search(vector<int>& nums, int target) {

        int l = 0; int r = nums.size() - 1;
        while (l < r)
            {
                int mid = (l + r) >> 1;  //r = mid, l = mid + 1
                if (nums[mid] >= target) r = mid;    // check()判断mid是否满足性质
                else l = mid + 1;
            }
            if(nums[l] != target)   return -1;
            return l;
    }
};
