class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int []res = new int[n];
        for(int i = 0;i<n;i++){
            int xor = 0;
            for(int j = queries[i][0];j<=queries[i][1];j++){
                xor = xor^arr[j];
            }
            res[i] = xor;
        }
        return res;
    }
}
