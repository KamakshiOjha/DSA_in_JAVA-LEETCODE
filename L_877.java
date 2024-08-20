class Solution {
    public boolean stoneGame(int[] piles) {
        Arrays.sort(piles);
        int a = 0;
        int b = 0;
        for(int i=piles.length-1;i>=0;i-=2){
            a +=piles[i];
        }
        for(int i=piles.length-2;i>=0;i-=2){
            b +=piles[i];
        }
        if(a>b){
            return true;
        }
        return false;

    }
}
