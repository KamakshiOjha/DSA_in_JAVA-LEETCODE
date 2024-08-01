class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int f = grid.length;
        int n = f*f;
        long s = (n * (n+1))/2;
        long s2 = (n * (n + 1) * (2 * n + 1)) / 6;
        long sn = 0, s2n = 0;
        for(int i = 0;i<f;i++){
            for(int j = 0;j<f;j++){
                sn += grid[i][j];
                s2n += grid[i][j]*grid[i][j];
            }
        }
        long val1 = s-sn;
        long val2 = s2-s2n;
        val2 = val2/val1;
        long x = (val1+val2)/2;
        long y = x-val1;
        return new int[]{(int)y,(int)x};
        
    }
}
