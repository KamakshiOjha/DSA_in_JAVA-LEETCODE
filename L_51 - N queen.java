class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List < List < String >> res = new ArrayList < List < String >> ();
        dfs(0,board,res);
        return res;
    }
    public static void dfs(int col, char[][]board ,List<List<String>> res){
        if(col == board.length){
            res.add(construct(board));
            return;
        }
        for(int row = 0;row<board.length;row++){
            if(validate(board,row,col)){
                board[row][col] = 'Q';
                dfs(col+1,board,res);
                board[row][col] = '.';
            }
        }
    }
    public static List<String> construct(char[][]board){
         List<String> des = new ArrayList<>();
         for(int i = 0;i<board.length;i++){
            String s = new String(board[i]);
            des.add(s);
         }
         return des;
    }
    public static boolean validate(char[][]board,int row,int col){
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }
}
