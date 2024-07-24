class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> mini = new ArrayList<>();
        ArrayList<Integer> maxi = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<m;j++){
                min = Math.min(min,matrix[i][j]);
            }
            mini.add(min);
        }
        for(int i = 0;i<m;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<n;j++){
                max = Math.max(max,matrix[j][i]);
            }
            maxi.add(max);
        }
        for(int i = 0;i<mini.size();i++){
            if(maxi.contains(mini.get(i)) && !result.contains(mini.get(i))){
                result.add(mini.get(i));
            }
        }
        return result;
    }
}
