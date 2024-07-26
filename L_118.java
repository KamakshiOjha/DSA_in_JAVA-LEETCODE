class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;i++){
            List<Integer> small = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                small.add(ncr(i,j));
            }
            arr.add(small);
        }
        return arr;
    }
    public int ncr (int n,int r){
        int result = 1;
        for(int i = 0;i<r;i++){
            result = result*(n-i);
            result = result/(i+1);
        }
        return result;
    }
}
