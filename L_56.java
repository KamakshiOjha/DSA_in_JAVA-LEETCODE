class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<List<Integer>> mergex = new ArrayList<>();
        int n = intervals.length;
        
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
        
        int initial = intervals[0][0];
        int fin = intervals[0][1];
        
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= fin) { 
                fin = Math.max(fin, intervals[i][1]);
            } else { 
                mergex.add(Arrays.asList(initial, fin));
                initial = intervals[i][0];
                fin = intervals[i][1];
            }
        }
        mergex.add(Arrays.asList(initial, fin));
        
        int numRows = mergex.size();
        int[][] matrix = new int[numRows][2];
        
        for (int i = 0; i < numRows; i++) {
            matrix[i][0] = mergex.get(i).get(0);
            matrix[i][1] = mergex.get(i).get(1);
        }
        
        return matrix;
        
    }
}
