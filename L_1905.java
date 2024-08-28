import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int row = grid1.length;
        int col = grid1[0].length;
        Set<Pair> visit = new HashSet<>();
        int count = 0;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (grid2[r][c] == 1 && !visit.contains(new Pair(r, c))) {
                    if (dfs(r, c, grid1, grid2, visit)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean dfs(int r, int c, int[][] grid1, int[][] grid2, Set<Pair> visit) {
        int row = grid1.length;
        int col = grid1[0].length;

        if (r < 0 || c < 0 || r >= row || c >= col || grid2[r][c] == 0) {
            return true;
        }

        if (visit.contains(new Pair(r, c))) {
            return true;
        }

        visit.add(new Pair(r, c));

        boolean isSubIsland = true;
        if (grid1[r][c] == 0) {
            isSubIsland = false;
        }

        isSubIsland &= dfs(r - 1, c, grid1, grid2, visit);
        isSubIsland &= dfs(r + 1, c, grid1, grid2, visit);
        isSubIsland &= dfs(r, c - 1, grid1, grid2, visit);
        isSubIsland &= dfs(r, c + 1, grid1, grid2, visit);

        return isSubIsland;
    }

    private static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return 31 * first + second;
        }
    }
}
