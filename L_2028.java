class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int total = 0;
        for(int i = 0;i<m;i++){
            total +=rolls[i];
        }
        int sum = (mean*(m+n)) - total;
        if(sum >6*n || sum<n){
            return new int[0];
        }
        int [] result = new int[n];
        int i = 0;
        while(n>0){
            int dice = Math.min(6,sum-n+1);
            result[i] = dice;
            sum -=dice;
            i++;
            n-=1;
        }
        return result;
        
    }
}
