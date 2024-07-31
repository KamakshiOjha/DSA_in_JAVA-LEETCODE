class Solution {
    private Map<Integer, Integer> memo = new HashMap<>();

    public int minHeightShelves(int[][] books, int shelfWidth) {
        return helper(0,books,shelfWidth);
    }
    public int helper(int i,int[][] books,int shelfWidth){
        if(i==books.length){
            return 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        int cur_width = shelfWidth;
        int max_height = 0;
        int result = Integer.MAX_VALUE;
        for(int j = i;j<books.length;j++){
            int width = books[j][0];
            int height = books[j][1];
            if(cur_width<width){
                break;
            }else{
                cur_width -= width;
                max_height = Math.max(max_height,height);
                result = Math.min(result,helper(j+1,books, shelfWidth)+max_height);
            }
        }
        memo.put(i, result);
        return result;
    }
}
