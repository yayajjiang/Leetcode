class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        int i = 0; int j = 0;
        while(i < nums1.size() && j < nums2.size()){
            if(nums1.at(i) < nums2.at(j)){
                i++;
            }else if(nums1.at(i) > nums2.at(j)){
                j++;
            }else if(nums1.at(i) ==  nums2.at(j) && find(ans.begin(), ans.end(), nums1.at(i))== ans.end()){
                ans.push_back(nums1.at(i));
            }else{
                i++; j++;
            }
        }
        return ans;
    }
};
