class Solution {
    public int oddCells(int m, int n, int[][] indices) {
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
