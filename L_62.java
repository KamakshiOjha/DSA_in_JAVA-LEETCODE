class Solution {
    public int uniquePaths(int m, int n) {
        int [] row = new int[n];
        Arrays.fill(row,1);
        for(int i = 0;i<m-1;i++){
            int []newrow = new int[n];
            Arrays.fill(newrow,1);
            for(int j = n-2;j>=0;j--){
                newrow[j] = newrow[j+1]+row[j];
            }row = newrow;
        }
        return row[0];
    }
}
