
class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {


        int n = matrix.size(), m = matrix[0].size();
        vector<vector<int>> res = matrix;
        vector<int> arr;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr.push_back(matrix[i][j]);
            }
        }
        vector<int> arr1 = arr;
        for (int i = 0; i < arr.size(); i++) {
            arr1[(i%m) * m + (m-1-i/m) ] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = arr1[i * m + j];
            }
        }
        
    
    }
};



class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
        // level flipping
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                swap(matrix[i][j], matrix[n - i - 1][j]);
            }
        }
        // diagonal flipping
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
    }
};

author：LeetCode-Solution
link：https://leetcode.cn/problems/rotate-image/solution/xuan-zhuan-tu-xiang-by-leetcode-solution-vu3m/
