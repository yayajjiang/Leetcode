class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        // int m = matrix.size();
        // int n = matrix[0].size();
        // vector<int> row(m), col(n);

        vector<pair<int, int>> zeros;
        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix[0].size(); j++){

                if(matrix[i][j] == 0){
                    zeros.push_back(make_pair(i,j));
                }
                // if (!matrix[i][j]) {
                //     row[i] = col[j] = true;
                // }
                //use boolean value to differentiate 0

            }
        }
        while(!zeros.empty()){
            int a = zeros.front().first;
            int b = zeros.front().second;
            for(int i = 0; i < matrix.size(); i++){
                matrix[i][b] = 0;
            }
            for(int j = 0; j < matrix[0].size(); j++){
                matrix[a][j] = 0;
            }
            zeros.erase(zeros.begin());
        }

        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (row[i] || col[j]) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

    }
};
