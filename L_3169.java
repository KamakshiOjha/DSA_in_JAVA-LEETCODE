class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, new Comparator<int[]>(){
            @Override
            public int compare(int[] row1, int[] row2) {
                return Integer.compare(row1[0], row2[0]);
            }
        });
        boolean[] tf = new boolean[days+1];
        
        for(int[] meet : meetings){
            int start = meet[0];
            int end = meet[1];
            for(int j = start;j<=end;j++){
                tf[j] = true;
            }
        }
        int count = 0;
        for(int i = 1;i<=days;i++){
            if(tf[i] == true){
                count++;
            }
        }
        return days-count;
    }
}
