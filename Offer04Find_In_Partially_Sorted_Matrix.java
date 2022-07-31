// class Solution {
//     public boolean findNumberIn2DArray(int[][] matrix, int target) {
//         if(matrix.length == 0){
//             return false;
//         }

//         int row = matrix.length;
//         int col = matrix[0].length;
//         int arow=0; int acol=0;
//         if(row==1){
//             for(int j = 0; j<col; j++){
//                 if(target == matrix[0][j]){
//                     return true;
//                 }
//             }
//             return false;
//         }
//         if(col==1){
//             for(int i = 0; i<row; i++){
//                 if(target == matrix[i][0]){
//                     return true;
//                 }
//             }
//             return false;
                
//         }
//         for(int i = 0; i<row; i++){
//             if(target <= matrix[i][0]){
//                 arow = i+1;
//             }
//         }
//         //System.out.println(row);
//         for(int j = 0; j<col; j++){
//             if(target <= matrix[0][j]){
//                 acol = j+1;
//             }
            
//         }
//         //System.out.println(col);
//         for(int i = 0; i<row; i++){
//             for(int j=acol; j<col; j++){
//                 if(target == matrix[i][j]){
//                             //System.out.println(target + " "+matrix[i][j]);
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


class Solution {
     public boolean findNumberIn2DArray(int[][] matrix, int target) {
         if(matrix.length == 0){
            return false;
        }
    
        int row = matrix.length; int arow=0;
        int col = matrix[0].length;
        if(row==1){
            for(int j = 0; j<col; j++){
                if(target == matrix[0][j]){
                    return true;
                }
            }
            return false;
        }
        if(col==1){
            for(int i = 0; i<row; i++){
                if(target == matrix[i][0]){
                    return true;
                }
            }
            return false;
                
        }
        col--;
        while(col>=0){
            if(target < matrix[0][col]){
                col--;
            }else{
                break;
            }
        }
        if(col<0){
            return false;
        }
        while(arow<row){
            if(target > matrix[arow][col]){
                arow++;
            }else{
                break;
            }
        }
        if(arow == row - 1 && target > matrix[arow][col]){
            return false;
        }
        int i; int j;
        //System.out.println(arow + " "+col);
        for(i = arow; i < row; i++ ){
            for (j = 0; j <= col; j++){
                //System.out.println(i + " "+j);
                 if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
     
     }
          
}

//It is a BST if twistted 45 degrees, 
//simplified
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0|| matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col >= 0) {
            if(matrix[row][col] > target) {//start from upper right corner
                col--;
            }else if(matrix[row][col] < target) {
                row++;
            }else {
                return true;
            }
        }
        return false;
    }
}
