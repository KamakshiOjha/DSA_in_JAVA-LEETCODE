class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int[][] result = new int[n][m];
        int k = 0;
        int diff = 0;
        int min = 0;
        for(int i = 0;i<n;i++){
            result[i][0] = rowSum[i];
        }
        for(int i = 0;i<m;i++){
            int current = 0;
            for(int j = 0;j<n;j++){
                current += result[j][i];
            }
            k = 0;
            while(current>colSum[i]){
                diff = current - colSum[i];
                min = Math.min(result[k][i],diff);
                result[k][i] -= min; 
                result[k][i+1] += min; 
                current -= min;
                k++;
            }
        }
        return result;
    }
}
