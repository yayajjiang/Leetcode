class Solution {
    public int oddCells(int m, int n, int[][] indices) {
//         for (int[] index : indices) {

//             for (int i = 0; i < n; i++) {
//                 grid[index[0]][i]++;
//             }

//             for (int i = 0; i < m; i++) {
//                 grid[i][index[1]]++;
//             }
//         }

        int odds = 0;
        int[][] matric = new int[m][n];
        for(int i = 0; i<indices.length; i++){
            int a = indices[i][0];
            int b = indices[i][1];
            for(int col = 0; col<n; col++ ){
                matric[a][col]++;
            }
            for(int row = 0; row<m; row++ ){
                matric[row][b]++;
            }
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                //System.out.println(matric[i][j]);
                if(matric[i][j] %2 == 1){

                    odds++;
                }
            }
        }
        return odds;
    }
}


//class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (((rows[i] + cols[j]) & 1) != 0) {
                    res++;
                }
            }
        }
        return res;
    }
}

author：LeetCode-Solution
link：https://leetcode.cn/problems/cells-with-odd-values-in-a-matrix/solution/qi-shu-zhi-dan-yuan-ge-de-shu-mu-by-leet-oa4o/

//optimization
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        //
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }
        //row odd
        int rowOdd = 0;
        for (int i = 0; i < m; i++) {
            if ((row[i] & 1) == 0) {
                rowOdd++;
            }
        }
        //colomn odd
        int colOdd = 0;
        for (int i = 0; i < n; i++) {
            if ((col[i] & 1) == 0) {
                colOdd++;
            }
        }
        return rowOdd * n + colOdd * m - 2 * rowOdd * colOdd;//even minus once, redundant minus twice
    }

author：jiang-hui-4
link：https://leetcode.cn/problems/cells-with-odd-values-in-a-matrix/solution/jishu-by-jiang-hui-4-yhyq/
