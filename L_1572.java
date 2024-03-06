//leetcode - 1572. Matrix Diagonal Sum
public class L_1572 {
    public static void main(String[] args) {
        int[][]mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        // System.out.println(n);
        int m = mat[0].length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(i==j || i+j == (n-1)){
                    sum += mat[i][j];
                }
            }
        }
        return sum;

    }
}
