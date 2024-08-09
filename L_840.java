class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int result = 0;
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                result += magic(i, j, grid);
            }
        }
        return result;
    }

    public static int magic(int r, int c, int[][] grid) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (i >= grid.length || j >= grid[0].length) {
                    return 0; 
                }
                if (set.contains(grid[i][j]) || grid[i][j] < 1 || grid[i][j] > 9) {
                    return 0;
                }
                set.add(grid[i][j]);
            }
        }

        for (int i = r; i < r + 3; i++) {
            if (grid[i][c] + grid[i][c + 1] + grid[i][c + 2] != 15) {
                return 0;
            }
        }

        for (int j = c; j < c + 3; j++) {
            if (grid[r][j] + grid[r + 1][j] + grid[r + 2][j] != 15) {
                return 0;
            }
        }

        if (((grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2]) != 15) ||
            ((grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c]) != 15)) {               
            return 0;
        }

        return 1;
    }
}
