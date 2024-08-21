class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        return solve(0, n - 1, s, dp);
    }

    public static int solve(int l, int r, String s, int[][] dp) {
        if (l > r) {
            return 0;
        }
        if (dp[l][r] != 0) {
            return dp[l][r];
        }
        dp[l][r] = solve(l + 1, r, s, dp) + 1;
        for (int i = l + 1; i <= r; i++) {
            if (s.charAt(i) == s.charAt(l)) {
                dp[l][r] = Math.min(dp[l][r], solve(l, i - 1, s, dp) + solve(i + 1, r, s, dp));
            }
        }
        return dp[l][r];
    }
}
