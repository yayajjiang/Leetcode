class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {

        int row = grid.size(), col = grid[0].size();
        int length = row * col;
        vector<vector<int>> ans = grid;
        vector<int> arr;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr.push_back(grid[row][col]); //insert every element inside
            }
        }
        vector<int> arr1 = arr;
        for (int i = 0; i < arr.size(); i++) {
            arr1[(k + i) % length] = arr[i];  //shift k location
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = arr1[i * col + j];  //be careful, is is col rather than row
            }
        }
        return res;
    }
};
