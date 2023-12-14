//2482. Difference Between Ones and Zeros in Row and Column
public class Difference_Between {
    public static void main(String[] args) {
        int[][] grid = { { 0, 1, 1 }, { 1, 0, 1 }, { 0, 0, 1 } };
        onesMinusZeros(grid);
    }

    public static void onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] diff = new int[m][n];
        for (int i = 0; i < m; i++) {

                int onerow = 0;
                int onecolm = 0;
                int zerorow = 0;
                int zerocolm = 0;
                int a = 0;
                int b = 0;
                for (int k = 0; k < m; k++) {
                    if (grid[k][i] == 0) {
                        zerocolm++;
                    } else {
                        zerorow ++;
                    }
                     b = zerocolm + zerorow;
                }
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] == 0) {
                        onerow++;
                    } else {
                        onecolm++;
                    }
                     a = onerow + onecolm;
                }
                
                int x = a - b;
                for (int j = 0; j < n; j++) {
                if(onerow + onecolm == zerocolm + zerorow){
                diff[i][j] = 0;
                }
             diff[i][j] = x;
             
            }
        }
        for(int i = 0;i<m;i++){
        for(int j = 0;j<n;j++){
        System.out.println(diff[i][j]);
        }
        }
    }
}
