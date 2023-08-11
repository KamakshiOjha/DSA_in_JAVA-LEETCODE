public class Strassens_algo {
    public static void main(String[] args) {
        int row = 2;
        int coln = 2; 
        int[][] matrix1 = {
            {1, 2},
            {4, 5}
        };
        int[][] matrix2 = {
            {1, 2},
            {4, 5}
        };
        Matrix_multiplication(matrix1,matrix2,row,coln);

    }
    public static void Matrix_multiplication(int[][] matrix1,int[][] matrix2,int row,int coln){
        int [][] main = new int[row][coln];
        int P = (matrix1[0][0] + matrix1[1][1]) * (matrix2[0][0] + matrix2[1][1]);
        int Q = (matrix1[1][0] + matrix1[1][1]) * (matrix2[0][0]);
        int R = (matrix1[0][0]) * (matrix2[0][1] - matrix2[1][1]);
        int S = (matrix1[1][1]) * (matrix2[1][0] - matrix2[0][0]);
        int T = (matrix1[0][0] + matrix1[0][1]) * (matrix2[1][1]);
        int U = (matrix1[1][0] - matrix1[0][0]) * (matrix2[0][0] + matrix2[0][1]);
        int V = (matrix1[0][1] - matrix1[1][1]) * (matrix2[1][0] + matrix2[1][1]);


        main[0][0] = P+S-T+V;
        main[0][1] = R+T;
        main[1][0] = Q+S;
        main[1][1] = P+R-Q+U;
        System.out.println("implementing strassen's for 2x2 matrix : ");
        for(int i=0;i<row;i++){
            for(int j =0;j<coln;j++){
                System.out.print(main[i][j] + " ");
                
            }System.out.println("\n");
        }
    }
}
