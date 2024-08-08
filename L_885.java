class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] result = new int[rows * cols][2]; 
        int r = rStart;
        int c = cStart;
        int steps = 0;
        int k = 0;
        int i = 0;
        while(k < rows * cols){
            if(i==0||i==2){
                steps++;
            }
            for(int j = 0;j<steps;j++){
                
                if(r >= 0 && r < rows && c >= 0 && c < cols){
                    result[k][0] = r;
                    result[k][1] = c;
                    k++;
                }r += direction[i][0]; 
                c += direction[i][1]; 
            }
            i = (i+1)%4;
        }
        return result;
    }
}
