using namespace std;
class Solution {
public:
    void quicksort(vector<int>& nums, int l, int r){
        if(l>=r)    return; //array of one element, return directly
        int x = nums[(l+r)/2];
        int i = l - 1;
        int j = r + 1;
        while(i < j){
            do{(i++);} while(nums[i] < x);
            do{(j--);} while(nums[j] > x);
            if(i < j)   swap(nums[i], nums[j]);
        }
        quicksort(nums, l, j);
        quicksort(nums, j+1, r);
    }
    void sortColors(vector<int>& nums) {
        int size = nums.size();
        int l = 0; int r = size-1;
        return quicksort(nums, l, r);
    }
};
