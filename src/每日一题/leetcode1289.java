package 每日一题;

/**
 * @auther XMZ
 * @create 2023--10-上午9:10
 * 与931基本相同，只是dp的约束条件发生了变化
 */
public class leetcode1289 {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            dp[0][i] = grid[0][i];
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j ++){
                dp[i][j] = grid[i][j];
                int temp = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++){
                    if(j == k)  continue;
                    temp = Math.min(temp,dp[i -1 ][k]);
                }
                dp[i][j] += temp;
            }
        }
        int res = dp[n -1][0];
        for(int i = 1; i < n; i++){
            res = Math.min(dp[n -1][i],res);
        }
        return res;
    }
}
