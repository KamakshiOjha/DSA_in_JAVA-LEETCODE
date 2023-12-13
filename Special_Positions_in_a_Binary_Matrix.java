// Leetcode - Given an m x n binary matrix mat, return the number of special positions in mat.
//A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

public class Special_Positions_in_a_Binary_Matrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 0, 0 }, { 0, 0, 1 }, { 1, 0, 0 } };
        System.out.println(numSpecial(mat));
    }

    public static int numSpecial(int[][] mat) {
        int count = 0;
        boolean value = true;
        int m = mat.length;
        int n = mat[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    for (int k = 0; k < n; k++) {
                        if (mat[i][k] != 0 && j != k) {
                            value = false;
                            break;
                        }
                    }
                    for (int k = 0; k < m; k++) {
                        if (mat[k][j] != 0 && i != k) {
                            value = false;
                            break;
                        }

                    }
                    if (value == true) {
                        count++;
                    }
                    value = true;
                }
            }

        }
        return count;
    }
}
