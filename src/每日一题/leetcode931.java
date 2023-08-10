package 每日一题;

/**
 * @auther XMZ
 * @create 2023--10-上午9:45
 * 简单的动态规划问题
 *
 */
public class leetcode931 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int dp[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            dp[0][i] = matrix[0][i];
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = matrix[i][j];
                if(j > 0 && j+1 < n){
                    dp[i][j] += Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),Math.min(dp[i-1][j-1],dp[i-1][j+1]));
                }
                if( j == 0){
                    dp[i][j] += Math.min(dp[i-1][j],dp[i-1][j+1]);
                }
                if(j == n-1){
                    dp[i][j] += Math.min(dp[i-1][j],dp[i-1][j-1]);
                }
            }
        }
        int res = dp[n-1][0];
        for(int i = 0; i < n; i++){
            res = Math.min(res,dp[n-1][i]);
        }
        return res;
    }


    public static void main(String[] args) {
        leetcode931 l1 = new leetcode931();
        int matrix[][] = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(l1.minFallingPathSum(matrix));
    }
}
