class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        int i = 0;
        long total = 0;
        for(int j : chalk){
            total+=j;
        }
        k%= total;
        while(k>=0){
            if(k<chalk[i]){
                return i;
            }
            k -= chalk[i];
            i++;
            if(i == n){
                i = 0;
            }
        }
        return i;
    }
}
