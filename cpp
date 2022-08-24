class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        // sort(target.begin(), target.end());
        // sort(arr.begin(), arr.end());
        // for(int i = 0; i < target.size(); i++){
        //     if(target[i]  != arr[i]){
        //         return false;
        //     }
        // }
        // return true;

        //bucket
        vector<int> bucket(1001);
        for (int i=0;i<target.size();i++)
            bucket[target[i]]++;

        for (int i=0;i<arr.size();i++) {
            bucket[arr[i]]--;
        }
        for(int j=0;j<bucket.size();j++){
            if(bucket[j]!=0)
                return false;
        }

        return true;
    }
};
