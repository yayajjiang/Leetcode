
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
