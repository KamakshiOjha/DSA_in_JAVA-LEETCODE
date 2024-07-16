class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int [][] mat = new int[m][n];
        int s = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                mat[j][s] = matrix[i][j];
            }
            s++;
        }
        return mat;
    }
}
